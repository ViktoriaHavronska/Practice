package basic_7_exercise.Inheritance;

public class Truck extends Vehicle {
    public int payload_capacity;

    public Truck(String brand, String model, int year, double rental_price, int payload_capacity) {
        super(brand, model, year, rental_price);
        this.payload_capacity = payload_capacity;
    }

    @Override
    public void get_info() {
        super.get_info();
        System.out.println("Truck - payload capacity:" + payload_capacity);
    }
}
