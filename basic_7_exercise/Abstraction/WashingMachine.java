package basic_7_exercise.Abstraction;

public class WashingMachine extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now running");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine has stopped.");
    }
}
