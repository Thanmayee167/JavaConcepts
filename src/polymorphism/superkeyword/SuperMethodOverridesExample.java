package polymorphism.superkeyword;

//Method Overriding and super
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
        call(); // This will call the method from the actual object type
    }

    void call() {
        System.out.println("Animal is calling");
    }
}

class Dog extends Animal {
    @Override
    void call() {
        System.out.println("Dog is barking");
    }
}

public class SuperMethodOverridesExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // What is the output?
    }
}
