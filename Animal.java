// Abstract class
abstract class Animal {
    // Abstract method (no implementation here)
    public abstract void sound();

    // You can also add a non-abstract method if needed
    public void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Subclass Lion extends Animal
class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("The lion roars: ROARRR!");
    }
}

// Subclass Tiger extends Animal
class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("The tiger growls: GRRRR!");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        // Call sound() method for each
        lion.sound();
        tiger.sound();

        // Demonstrate inherited method
        lion.sleep();
        tiger.sleep();
    }
}

