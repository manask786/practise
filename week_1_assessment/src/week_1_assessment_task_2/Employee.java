package week_1_assessment_task_2;

public class Employee extends Person {
    private int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
        System.out.println("Employee created");
    }

    public int getId() {
        return id;
    }
}
