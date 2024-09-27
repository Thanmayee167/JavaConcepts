package polymorphism.binding;

class Animal {
    static void display() {
        System.out.println("Animal static method");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    static void display() {
        System.out.println("Dog static method");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class StaticBinding {
    public static void main(String[] args) {
        Animal animal = new Dog();

        Animal.display();  // Static binding: Calls Animal's static method
    }
}
