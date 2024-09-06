package polymorphism.methodoverloading;

//Example of Method Overloading main method
public class MainExample {

    // This is the standard entry point method
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");

        // Calling overloaded main methods
        main(10);
        main("Hello");
        main(5, 10);
    }

    // Overloaded main method with an integer parameter
    public static void main(int a) {
        System.out.println("Main method with int argument: " + a);
    }

    // Overloaded main method with a string parameter
    public static void main(String str) {
        System.out.println("Main method with String argument: " + str);
    }

    // Overloaded main method with two integer parameters
    public static void main(int a, int b) {
        System.out.println("Main method with two int arguments: " + a + " and " + b);
    }
}
