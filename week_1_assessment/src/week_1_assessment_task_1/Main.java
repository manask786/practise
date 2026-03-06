/**
 * 
 */
package week_1_assessment_task_1;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Trainee> trainees = new ArrayList<>();

        trainees.add(new TechnicalTrainee("T01", "Amit", 12));
        trainees.add(new SoftSkillTrainee("T02", "Neha", 15));
        trainees.add(new TechnicalTrainee("T03", "Rohit", 9));
        trainees.add(new SoftSkillTrainee("T04", "Sneha", 20));

        TrainingReport.generateReport(trainees);
    }
}