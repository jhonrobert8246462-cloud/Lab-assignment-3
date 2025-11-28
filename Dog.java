// Animal.java
interface Animal {
    void bark();
}

// Dog.java
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.bark();
    }
}


