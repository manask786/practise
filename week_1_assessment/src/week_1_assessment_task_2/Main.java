/**
 * 
 */
package week_1_assessment_task_2;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer("Arjun", 201);
        Tester tester = new Tester("Meena", 202);

        developer.work();
        tester.work();
    }
}