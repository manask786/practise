/**
 * 
 */
package week_1_assessment_task_3;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone(50);

        phone.charge(30);
        phone.useBattery(20);

        phone.displayBatteryLevel();
    }
}