package polymorphism.methodoverloading;

//Example of Method Overloading with TypePromotion
class DataTypePromotionExample1 {
    public static void main(String[] args) {
        DataTypePromotionExample1 obj = new DataTypePromotionExample1();
        obj.sum(20, 20);//now second int literal will be promoted to long
        obj.sum(20, 20, 20);

    }

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}  