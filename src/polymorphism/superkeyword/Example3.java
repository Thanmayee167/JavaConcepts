package polymorphism.superkeyword;

//super is used to invoke parent class constructor.
class AnimalExample2 {
    AnimalExample2() {
        System.out.println("Animal is created");
    }
}

class DogExample2 extends AnimalExample2 {
    DogExample2() {
        super();
        System.out.println("Dog22 is created");
    }
}

public class Example3 {
    public static void main(String[] args) {
        DogExample2 d = new DogExample2();
    }
}