package polymorphism.methodoverloading;

//Example of Method Overloading, in case of different return types
class Adder {
    int add(int a, int b) {
        return a + b;
    }

    /*
    double add(int a, int b) {
        return (double) a + b;
    }
    */
}

public class Example2 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(5, 10));  // Which add() method should be called? ambiguity -> CompilationError
    }
}
