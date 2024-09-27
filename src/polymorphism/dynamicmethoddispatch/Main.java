package polymorphism.dynamicmethoddispatch;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    private void display() {
        System.out.println("hi animal");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal;  // Reference of type Animal

        animal = new Dog();  // Object of type Dog
        animal.makeSound();  // Calls Dog's makeSound() at runtime
        //animal.display();

        animal = new Cat();  // Object of type Cat
        animal.makeSound();  // Calls Cat's makeSound() at runtime
    }
}
