package relationships;

// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another Subclass
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Dog is-a Animal
        dog.eat(); // Inherited from Animal
        dog.bark(); // Specific to Dog

        // Cat is-a Animal
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}
