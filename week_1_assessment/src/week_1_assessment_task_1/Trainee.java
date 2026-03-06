package week_1_assessment_task_1;

public abstract class Trainee {
    protected String id;
    protected String name;
    protected String trainingType;

    public Trainee(String id, String name, String trainingType) {
        this.id = id;
        this.name = name;
        this.trainingType = trainingType;
    }

    public abstract double calculateProgressScore();

    public void displayDetails() {
        System.out.println(id + " - " + name + " - " + trainingType);
    }
}
