package basic_7_exercise.Polymorphism;

    //обчисліть зарплату на основі проектної ставки.

public class Freelancer extends Employee {
    public double project_rate;

    public Freelancer(String name, double project_rate) {
        super(name);
        this.project_rate = project_rate;
    }

    @Override
    public double calculate_salary() {
        this.salary = project_rate;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee Freelancer {" + super.toString() + " }";
    }
}
