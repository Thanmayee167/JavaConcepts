package polymorphism.superkeyword;

//Using super in Static Methods
class Animal3 {
    static void staticMethod() {
        // Can you use super here?
        System.out.println("Static Method in Animal");
    }
}

class Dog3 extends Animal3 {
    static void staticMethod() {
        // super.staticMethod();  // Is this allowed?
        System.out.println("Static Method in Dog");
    }
}

public class SuperStatic {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        Dog3.staticMethod();
    }
}
