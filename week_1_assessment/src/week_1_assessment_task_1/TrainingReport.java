/**
 * 
 */
package week_1_assessment_task_1;

/**
 * 
 */
import java.util.List;

public class TrainingReport {

    public static void generateReport(List<Trainee> trainees) {
        double highestScore = 0;
        Trainee topPerformer = null;

        System.out.println("Trainee Details:");

        for (Trainee trainee : trainees) {
            trainee.displayDetails();
            double score = trainee.calculateProgressScore();
            System.out.println("Progress Score: " + score);
            System.out.println();

            if (score > highestScore) {
                highestScore = score;
                topPerformer = trainee;
            }
        }

        System.out.println("Top Performer:");
        if (topPerformer != null) {
            System.out.println(topPerformer.name + " with a score of " + highestScore);
        }
    }
}
