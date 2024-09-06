package polymorphism.methodoverriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    // Superclass method that declares a checked exception
    void show() throws IOException {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    // Overriding method that throws a subclass of the declared exception
    @Override
    void show() throws FileNotFoundException { // FileNotFoundException is a subclass of IOException
        System.out.println("Child class method");
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        try {
            obj.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
