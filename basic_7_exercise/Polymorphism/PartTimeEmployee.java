package basic_7_exercise.Polymorphism;

    // обчисліть зарплату на основі відпрацьованих годин і погодинної ставки.

public class PartTimeEmployee extends Employee {
    public double hours_worked;
    public double hourly_rate;

    public PartTimeEmployee(String name, double hours_worked, double hourly_rate) {
        super(name);
        this.hours_worked = hours_worked;
        this.hourly_rate = hourly_rate;
    }

    @Override
    public double calculate_salary() {
        this.salary = hours_worked * hourly_rate;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee PartTime {" + super.toString() + " }";
    }
}