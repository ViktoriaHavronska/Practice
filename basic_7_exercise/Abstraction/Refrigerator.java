package basic_7_exercise.Abstraction;

public class Refrigerator extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is cooling");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is off.");
    }
}
