package polymorphism.finalkeyword;

public class FinalVariable {
    final int speedlimit = 90;//final variable

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.run();
    }

    void run() {
        //speedlimit=400; //Compilation error
    }
}//end of class