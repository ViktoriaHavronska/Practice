package basic_7_exercise.Inheritance;

public class Car extends Vehicle {
    public int num_doors;

    public Car(String brand, String model, int year, double rental_price, int num_doors) {
        super(brand, model, year, rental_price);
        this.num_doors = num_doors;
    }

    @Override
    public void get_info() {
        super.get_info();
        System.out.println("Car- Number of doors: " + num_doors);
    }
}
