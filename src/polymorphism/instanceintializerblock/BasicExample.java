package polymorphism.instanceintializerblock;

class BasicExample {
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block executed");
    }

    BasicExample() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        BasicExample basicExample = new BasicExample();
    }
}
