package polymorphism.superkeyword;

//Example of super keyword where super() is provided by the compiler implicitly.
class AnimalExample3 {
    AnimalExample3() {
        System.out.println("animal is created");
    }
}

class DogExample3 extends AnimalExample3 {
    DogExample3() {
        System.out.println("dog is created");
    }
}

public class Example4 {
    public static void main(String[] args) {
        DogExample3 d = new DogExample3();
    }
}