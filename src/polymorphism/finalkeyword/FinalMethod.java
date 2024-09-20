package polymorphism.finalkeyword;

class Bike {
    final void run() {
        System.out.println("running");
    }
}

public class FinalMethod extends Bike {
    //void run(){System.out.println("running safely with 100kmph");}  //Compilation error

    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.run();
    }
} 