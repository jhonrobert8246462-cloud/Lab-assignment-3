// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts with a key or push button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stops when the key is turned off or button is pressed.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine starts with a kick or electric starter.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine stops when the ignition is turned off.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("=== Car ===");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n=== Motorcycle ===");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

