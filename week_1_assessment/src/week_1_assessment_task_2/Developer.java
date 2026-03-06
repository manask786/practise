/**
 * 
 */
package week_1_assessment_task_2;

/**
 * 
 */
public class Developer extends Employee {

    public Developer(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(getName() + " (ID " + getId() + ") is writing code");
    }
}
