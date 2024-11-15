package basic_7_exercise.Inheritance;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public double rental_price;

    public Vehicle(String brand, String model, int year, double rental_price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rental_price = rental_price;
    }



    public double calculate_rental_cost(int days) {
        return days * rental_price;
    }

    public void get_info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Rental Price: " + rental_price);
    }
}
