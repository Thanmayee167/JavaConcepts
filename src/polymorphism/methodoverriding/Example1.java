package polymorphism.methodoverriding;

//Basic Example of Method Overriding
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
}

public class Example1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks
    }
}
