package basic_7_exercise.Polymorphism;

public class Employee {
    public double salary;
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculate_salary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee { name='" + name + "', salary=" + salary + " }";
    }

    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Mike", 2500);
        fullTime.calculate_salary();
        System.out.println(fullTime);

        Employee partTime = new PartTimeEmployee("Nina", 120, 200);
        partTime.calculate_salary();
        System.out.println(partTime);

        Employee freelancer = new Freelancer("Kiko", 2000);
        freelancer.calculate_salary();
        System.out.println(freelancer);
    }
}
