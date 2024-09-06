package polymorphism.methodoverloading;

//Basic Example of Method Overloading
class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Example1 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calls the method to add two integers
        System.out.println(math.add(5, 10));  // Output: 15

        // Calls the method to add three integers
        System.out.println(math.add(5, 10, 15));  // Output: 30

        // Calls the method to add two doubles
        System.out.println(math.add(5.5, 10.5));  // Output: 16.0
    }
}
