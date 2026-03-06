/**
 * 
 */
package week_1_assessment_task_5;

/**
 * 
 */
public class SubscriptionCalculator {

    public double calculateRevenue(String tier) {
        return getBasePrice(tier);
    }

    public double calculateRevenue(String tier, String[] addons) {
        double total = getBasePrice(tier);
        total += getAddonsPrice(addons);
        return total;
    }

    public double calculateRevenue(String tier, String[] addons, boolean yearly, int referrals) {
        double base = getBasePrice(tier);
        double addonsTotal = getAddonsPrice(addons);
        double subtotal = base + addonsTotal;

        System.out.println("Base = " + (int) base);
        System.out.println("Addons = " + (int) addonsTotal);
        System.out.println("Subtotal = " + (int) subtotal);

        if (yearly) {
            double discount = subtotal * 0.15;
            System.out.println("Yearly discount = " + (int) discount);
            subtotal -= discount;
            System.out.println("After discount = " + (int) subtotal);
        }

        double referralBonus = referrals * 500;
        System.out.println("Referrals = +" + (int) referralBonus);

        double finalRevenue = subtotal + referralBonus;
        System.out.println("Final Revenue = " + (int) finalRevenue);

        return finalRevenue;
    }

    private double getBasePrice(String tier) {
        switch (tier.toUpperCase()) {
            case "BASIC":
                return 3000;
            case "PRO":
                return 8000;
            case "ENTERPRISE":
                return 20000;
            default:
                return 0;
        }
    }

    private double getAddonsPrice(String[] addons) {
        double total = 0;
        if (addons == null) return total;

        for (String addon : addons) {
            switch (addon.toUpperCase()) {
                case "STORAGE":
                    total += 2000;
                    break;
                case "SUPPORT":
                    total += 5000;
                    break;
                case "AI-MODULE":
                    total += 12000;
                    break;
            }
        }
        return total;
    }
}
