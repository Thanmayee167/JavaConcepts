package polymorphism.instanceintializerblock;

//Initializing Common Code for Multiple Constructors
class InstanceInitializerBlockMultipleConstructor {
    String type;

    // Instance Initializer Block
    {
        type = "InstanceIntializerBlockMultipleConstructor";
        System.out.println("Type set in Instance Initializer Block");
    }

    InstanceInitializerBlockMultipleConstructor() {
        System.out.println("No-argument constructor");
    }

    InstanceInitializerBlockMultipleConstructor(String name) {
        System.out.println("Parameterized constructor: " + name);
    }

    public static void main(String[] args) {
        InstanceInitializerBlockMultipleConstructor v1 = new InstanceInitializerBlockMultipleConstructor();
        InstanceInitializerBlockMultipleConstructor v2 = new InstanceInitializerBlockMultipleConstructor("Car");
    }
}
