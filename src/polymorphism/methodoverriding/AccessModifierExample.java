package polymorphism.methodoverriding;

class Parent1 {
    // Public method in the superclass
    public void display() {
        System.out.println("Parent display method");
    }
}

class Child1 extends Parent1 {
    // Attempting to override with a more restrictive access modifier (protected)
    /*
    @Override
    protected void display() { // This will cause a compilation error
        System.out.println("Child display method");
    }
    */
    @Override
    public void display() { // This will execute without error
        System.out.println("Child display method");
    }

}


public class AccessModifierExample {
    public static void main(String[] args) {
        Parent1 obj = new Child1();
        obj.display();
    }
}
