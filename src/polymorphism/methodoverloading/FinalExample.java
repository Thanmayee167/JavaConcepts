package polymorphism.methodoverloading;

class Example {

    // Final method
    public final void display() {
        System.out.println("Final display method with no parameters");
    }

    // Overloaded method
    public final void display(int a) {
        System.out.println("Overloaded display method with one parameter: " + a);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Example example = new Example();
        example.display();        // Calls the final method
        example.display(10);      // Calls the overloaded method
    }
}
