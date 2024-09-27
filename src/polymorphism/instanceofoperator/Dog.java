package polymorphism.instanceofoperator;

class Animal {
}

public class Dog extends Animal2 {//Dog inherits Animal2

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Animal2);//true
    }
}  