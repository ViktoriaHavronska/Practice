package basic_7_exercise.Inheritance;

public class Motorcycle extends Vehicle {
    public boolean has_sidecar;

    public Motorcycle(String brand, String model, int year, double rental_price, boolean has_sidecar) {
        super(brand, model, year, rental_price);
        this.has_sidecar = has_sidecar;
    }

    @Override
    public void get_info() {
        super.get_info();
        System.out.println("Motorcycle - Has sidecar: " + (has_sidecar ? "Yes" : "No"));

    }
}
