package polymorphism.superkeyword;

//super can be used to invoke parent class method
class AnimalExample1 {
    void eat() {
        System.out.println("eating...");
    }
}

class DogExample1 extends AnimalExample1 {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class Example2 {
    public static void main(String[] args) {
        DogExample1 d = new DogExample1();
        d.work();
    }
}