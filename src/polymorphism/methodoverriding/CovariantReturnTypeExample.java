package polymorphism.methodoverriding;

class Animal1 {
    // Superclass method with a return type of Animal
    Animal1 getAnimal() {
        System.out.println("Returning instance of Animal");
        return new Animal1();
    }
}

class Dog1 extends Animal1 {
    // Overridden method with a covariant return type (Dog1 is a subclass of Animal)
    @Override
    Dog1 getAnimal() {
        System.out.println("Returning instance of Dog");
        return new Dog1();
    }
}

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        Animal1 anotherAnimal = myAnimal.getAnimal(); // Returns Animal

        Dog1 myDog = new Dog1();
        Dog1 anotherDog = myDog.getAnimal(); // Returns Dog1

        // Even though getAnimal() in Dog1 class overrides getAnimal() in Animal,
        // the return type is specific to Dog1
        Animal1 upcastedDog = myDog.getAnimal(); // Valid, Dog1 is an Animal
    }
}

