package superkeyword;

//Accessing Hidden Fields
class Animal5 {
    private String name = "Animal5";

    public String getName() {
        return name;
    }
}

class Dog5 extends Animal5 {
    String name = "Dog5";

    void printName() {
        System.out.println(name);          // Prints "Dog5"
        //System.out.println(super.name);    // Compilation error
        System.out.println(super.getName()); // Prints "Animal5"
    }
}

public class SuperPrivate {
    public static void main(String[] args) {
        Dog5 dog5 = new Dog5();
        dog5.printName();
    }
}
