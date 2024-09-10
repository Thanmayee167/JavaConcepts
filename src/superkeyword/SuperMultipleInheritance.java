package superkeyword;

//super in Multiple Inheritance via Interfaces
interface Animal4 {
    default void makeSound() {
        System.out.println("Animal4 sound");
    }
}

interface Pet {
    default void makeSound() {
        System.out.println("Pet sound");
    }
}

class Dog4 implements Animal4, Pet {
    @Override
    public void makeSound() {
        Animal4.super.makeSound();  // Calls Animal4's makeSound
        Pet.super.makeSound();     // Calls Pet's makeSound
    }
}

public class SuperMultipleInheritance {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.makeSound();
    }
}
