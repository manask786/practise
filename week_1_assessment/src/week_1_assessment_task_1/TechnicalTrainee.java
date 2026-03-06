/**
 * 
 */
package week_1_assessment_task_1;

/**
 * 
 */
public class TechnicalTrainee extends Trainee {
    private int modulesCompleted;

    public TechnicalTrainee(String id, String name, int modulesCompleted) {
        super(id, name, "Technical");
        this.modulesCompleted = modulesCompleted;
    }

    public double calculateProgressScore() {
        return modulesCompleted * 10;
    }
}
