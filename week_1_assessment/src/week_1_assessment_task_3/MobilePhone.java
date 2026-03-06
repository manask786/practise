/**
 * 
 */
package week_1_assessment_task_3;

/**
 * 
 */
public class MobilePhone {
    private int batteryLevel;

    public MobilePhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void charge(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    public void useBattery(int amount) {
        batteryLevel -= amount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
    }

    public void displayBatteryLevel() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
