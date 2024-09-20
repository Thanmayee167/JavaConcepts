package polymorphism.finalkeyword;

public class BlankFinalInstanceInitializeBlock {
    final int speedlimit;//blank final variable

    {
        speedlimit = 70;
    }

    BlankFinalInstanceInitializeBlock() {
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        new BlankFinalInstanceInitializeBlock();
    }
}  