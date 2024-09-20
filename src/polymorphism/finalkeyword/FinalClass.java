package polymorphism.finalkeyword;

final class Parent {
}

public class FinalClass {//extends Parent {  //Compilation error

    public static void main(String[] args) {
        FinalClass honda = new FinalClass();
        honda.run();
    }

    void run() {
        System.out.println("running safely with 100kmph");
    }
}  