// Flyable.java
interface Flyable {
    void fly_obj();
}

// Spacecraft.java
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying into outer space at high speed!");
    }
}

// Airplane.java
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is cruising at 35,000 feet altitude!");
    }
}

// Helicopter.java
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is hovering and flying at low altitude!");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Spacecraft(), new Airplane(), new Helicopter() };

        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}
