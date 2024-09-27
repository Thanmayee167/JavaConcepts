package polymorphism.binding;

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1(); // Parent reference, but Dog object
        animal1.makeSound();        // Dynamic binding: Calls Dog's overridden method
    }
}
