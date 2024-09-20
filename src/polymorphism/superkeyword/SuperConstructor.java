package polymorphism.superkeyword;

// Constructor Chaining with super
class Animal1 {
    //comment below constructor for more understanding
    Animal1() {
    }

    Animal1(String name) {
        System.out.println("Animal1: " + name);
    }
}

class Dog1 extends Animal1 {
    Dog1() {
        // What happens here?
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Dog1 Dog1 = new Dog1();  // Will this compile?
        Animal1 animal1 = new Animal1();
    }
}
