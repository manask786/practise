/**
 * 
 */
package week_1_assessment_task_5;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {

        SubscriptionCalculator calculator = new SubscriptionCalculator();

        String tier = "PRO";
        String[] addons = {"STORAGE", "AI-MODULE"};
        boolean yearly = true;
        int referrals = 4;

        calculator.calculateRevenue(tier, addons, yearly, referrals);
    }
}
