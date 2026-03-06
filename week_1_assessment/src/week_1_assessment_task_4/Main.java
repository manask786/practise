/**
 * 
 */
package week_1_assessment_task_4;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {

        Machine m1 = new Machine(201, "CNC");
        Machine m2 = new Machine(202, "Robotic Arm");

        m1.displayDetails();
        m2.displayDetails();

        System.out.println("Total Machines: " + Machine.getTotalMachines());
    }
}
