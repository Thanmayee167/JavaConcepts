package instanceintializerblock;

//Order of Execution with Superclass and Subclass
class Parent1 {
    {
        System.out.println("Parent1 Instance Initializer Block");
    }

    Parent1() {
        System.out.println("Parent1 Constructor");
    }
}

class Child1 extends Parent1 {
    {
        System.out.println("Child1 Instance Initializer Block");
    }

    Child1() {
        System.out.println("Child1 Constructor");
    }
}

public class InstanceInitializerBlockWithSuper {
    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}
