package basic_7_exercise.Abstraction;

public class Oven extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Oven is preheating");
    }

    @Override
    public void turnOff() {
        System.out.println("Oven is off.");
    }
}
