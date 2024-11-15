package basic_5_exercise.Inheritance;

class Designer extends Employee {
    public String designTool;

    public Designer(String name, int salary, String designTool) {
        super(name, salary);
        this.designTool = designTool;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("A Designer has a design tool they are proficient in.");
        System.out.println("Designer{" +
                "designTool='" + designTool + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}');
    }
}
