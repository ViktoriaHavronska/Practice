package basic_7_exercise.Abstraction;

abstract class Appliance {
   abstract void turnOn();
    abstract void turnOff();

    public static void main(String[] args) {
        Appliance washing = new WashingMachine();
        washing.turnOn();
        washing.turnOff();

        Appliance refrigerator = new Refrigerator();
        refrigerator.turnOn();
        refrigerator.turnOff();

        Appliance oven = new Oven();
        oven.turnOn();
        oven.turnOff();

    }
}
