package polymorphism.methodoverloading;

//Example of Method Overloading with Type Promotion in case of ambiguity
class DataTypePromotionExample3 {
    public static void main(String[] args) {
        DataTypePromotionExample3 obj = new DataTypePromotionExample3();
        obj.sum(20, 20);//now ambiguity
    }
    /*void sum(long a,int b){System.out.println("b method invoked");}  */

    void sum(int a, long b) {
        System.out.println("a method invoked");
    }
}