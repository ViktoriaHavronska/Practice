package basic_5_exercise.Inheritance;

class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
Employee manager = new Manager("Adam",2000,500);
manager.displayInfo();

Employee developer = new Developer("Lusi",2500,"Java");
developer.displayInfo();

Employee designer = new Designer("Karol",2300, "JavaScript");
designer.displayInfo();

    }
}
