package basic_7_exercise.Polymorphism;

    //задайте фіксовану місячну зарплату.

public class FullTimeEmployee extends Employee {
    public double monthly_salary;

    public FullTimeEmployee(String name, double monthly_salary) {
        super(name);
        this.monthly_salary = monthly_salary;
    }

    @Override
    public double calculate_salary() {
        this.salary = monthly_salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee FullTime {" + super.toString() + " }";
    }
}