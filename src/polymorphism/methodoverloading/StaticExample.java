package polymorphism.methodoverloading;

class Display {

    // Static method 1: No parameters
    public static void display() {
        System.out.println("Display with no parameters");
    }

    // Static method 2: One integer parameter
    public static void display(int a) {
        System.out.println("Display with one int parameter: " + a);
    }

    // Static method 3: Two parameters (int, String)
    public static void display(int a, String b) {
        System.out.println("Display with int and String parameters: " + a + ", " + b);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Calling overloaded static methods
        Display.display();                  // Calls method 1
        Display.display(10);                // Calls method 2
        Display.display(10, "Hello");       // Calls method 3
    }
}
