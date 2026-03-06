/**
 * 
 */
package week_1_assessment_task_4;

/**
 * 
 */
public class Machine {

    private int machineId;
    private String machineType;
    private static int totalMachines;

    static {
        System.out.println("Factory Monitoring System Started");
    }

    {
        System.out.println("Machine Object Created");
    }

    public Machine(int machineId, String machineType) {
        this.machineId = machineId;
        this.machineType = machineType;
        totalMachines++;
    }

    public void displayDetails() {
        System.out.println(machineId + " " + machineType);
    }

    public static int getTotalMachines() {
        return totalMachines;
    }
}
