abstract class Animal {
    // Abstract methods
    public abstract void eat();
    public abstract void sleep();
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion hunts and eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleeps for about 20 hours a day under the shade.");
    }
}

// Subclass Tiger
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger hunts alone and eats large prey like deer or buffalo.");
    }

    @Override
    public void sleep() {
        System.out.println("The tiger usually sleeps during the day and hunts at night.");
    }
}

// Subclass Deer
class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("The deer grazes on grass and plants peacefully.");
    }

    @Override
    public void sleep() {
        System.out.println("The deer sleeps lightly at night, always alert for predators.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        System.out.println("=== Lion ===");
        lion.eat();
        lion.sleep();

        System.out.println("\n=== Tiger ===");
        tiger.eat();
        tiger.sleep();

        System.out.println("\n=== Deer ===");
        deer.eat();
        deer.sleep();
    }
}