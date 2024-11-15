package basic_7_exercise.Inheritance;

import java.util.List;
import java.util.ArrayList;

public class RentalService{
    private List<Vehicle> availableVehicles;

    public RentalService(){
        this.availableVehicles = new ArrayList<>();
    }

    public void add_vehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public double rent_vehicle(Vehicle vehicle, int days) {
        return vehicle.calculate_rental_cost(days);
    }

    public void list_vehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : availableVehicles) {
            vehicle.get_info();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        Vehicle car = new Car("Audi", "A7", 2019, 132, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2020, 150, 1000);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 80, true);

        rentalService.add_vehicle(car);
        rentalService.add_vehicle(truck);
        rentalService.add_vehicle(motorcycle);

        rentalService.list_vehicles();

        double cost = rentalService.rent_vehicle(car, 5);
        System.out.println("Rental cost for car: " + cost);
    }
}
