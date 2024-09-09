package instanceintializerblock;

//
public class InitializerBlockPositionExample {
    // First Instance Initializer Block
    {
        System.out.println("First Instance Initializer Block");
    }

    // Third Instance Initializer Block
    {
        System.out.println("Third Instance Initializer Block");
    }

    // Constructor
    InitializerBlockPositionExample() {
        System.out.println("Constructor");
    }

    // Second Instance Initializer Block
    {
        System.out.println("Second Instance Initializer Block");
    }

    public static void main(String[] args) {
        InitializerBlockPositionExample obj = new InitializerBlockPositionExample();
    }
}
