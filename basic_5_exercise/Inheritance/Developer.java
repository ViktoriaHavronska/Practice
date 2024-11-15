package basic_5_exercise.Inheritance;

class Developer extends Employee {
    public String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("A Developer has a programming language they specialize in.");
        System.out.println("Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}');
    }
}