package basic_5_exercise.Inheritance;

class Manager extends Employee {
    public int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("A Manager has a bonus in addition to the salary.");
        System.out.println("Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}');
    }
}