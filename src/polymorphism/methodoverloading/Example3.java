package polymorphism.methodoverloading;

//Example for Method Overloading in Hierarchy
class Parent {
    void display(int a) {
        System.out.println("Parent display with int: " + a);
    }

    void display(String b) {
        System.out.println("Parent display with String: " + b);
    }
}

class Child extends Parent {
    void display(long a) { // Overloading in the child class
        System.out.println("Child display with long: " + a);
    }

    // Overloading the parent method with a different parameter list
    void display(int a, String b) {
        System.out.println("Child display with int and String: " + a + ", " + b);
    }
}

public class Example3 {
    public static void main(String[] args) {
        Parent parentRef = new Parent();
        Child childRef = new Child();
        Parent parentChildRef = new Child(); // Parent reference, but pointing to a Child object

        // Calls the method in Parent class
        parentRef.display(5);                 // Output: Parent display with int: 5
        parentRef.display("Hello");           // Output: Parent display with String: Hello

        // Calls the overloaded method in Child class
        childRef.display(5);                // Output: Child display with double: 5.5
        childRef.display(10, "World");        // Output: Child display with int and String: 10, World

        // Even though parentChildRef is pointing to a Child object, the reference is of type Parent
        parentChildRef.display(10);           // Output: Parent display with int: 10
        parentChildRef.display("Hi");         // Output: Parent display with String: Hi
    }
}
