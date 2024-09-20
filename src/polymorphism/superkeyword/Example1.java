package polymorphism.superkeyword;

//super is used to refer immediate parent class instance variable.
class AnimalExample {
    String color = "white";
}

class DogExample extends AnimalExample {
    String color = "black";

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

public class Example1 {
    public static void main(String[] args) {
        DogExample d = new DogExample();
        d.printColor();
    }
}