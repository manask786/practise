/**
 * 
 */
package week_1_assessment_task_1;

/**
 * 
 */
public class SoftSkillTrainee extends Trainee {
    private int sessionsAttended;

    public SoftSkillTrainee(String id, String name, int sessionsAttended) {
        super(id, name, "Soft Skill");
        this.sessionsAttended = sessionsAttended;
    }

    public double calculateProgressScore() {
        return sessionsAttended * 8;
    }
}
