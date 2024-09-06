package polymorphism.methodoverloading;

//Example of Method Overloading with Type Promotion if matching found
class DataTypePromotionExample2 {
    public static void main(String[] args) {
        DataTypePromotionExample2 obj = new DataTypePromotionExample2();
        obj.sum(20, 20);//now int arg sum() method gets invoked
    }

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }
}  