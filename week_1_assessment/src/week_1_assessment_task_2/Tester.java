/**
 * 
 */
package week_1_assessment_task_2;

/**
 * 
 */
public class Tester extends Employee {

    public Tester(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(getName() + " (ID " + getId() + ") is testing software");
    }
}
