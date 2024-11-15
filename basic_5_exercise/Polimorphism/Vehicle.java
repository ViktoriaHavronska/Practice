package basic_5_exercise.Polimorphism;

class Vehicle {

    public void move() {
        System.out.println("Vehicle is moving");
    }

    static class Car extends Vehicle {
        public void move() {
            System.out.println("Car is moving by driving.");
        }
    }

    static class Boat extends Vehicle {
        public void move() {
            System.out.println("Boat is moving by sailing.");
        }
    }

    static class Plane extends Vehicle {
        public void move() {
            System.out.println("Plane is moving by flying.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();

        vehicle.move();
        car.move();
        boat.move();
        plane.move();
    }
}
