package polymorphism.finalkeyword;

public class FinalParameter {
    public static void main(String[] args) {
        FinalParameter obj = new FinalParameter();
        System.out.println(obj.cube(5));
    }

    int cube(final int n) {
        //n=n+2;//can't be changed as n is final  //Compilation error
        return n * n * n;
    }
}  