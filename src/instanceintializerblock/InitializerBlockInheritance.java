package instanceintializerblock;

//Order of Execution with Superclass and Subclass
class Parent {
    {
        System.out.println("Parent Instance Initializer Block");
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    {
        System.out.println("Child Instance Initializer Block");
    }

    Child() {
        System.out.println("Child Constructor");
    }
}

public class InitializerBlockInheritance {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
