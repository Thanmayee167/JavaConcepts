package polymorphism.finalkeyword;

public class BlankFinalStatic {
    final static int speedlimit;//blank final variable

    static {
        speedlimit = 70;
    }

    BlankFinalStatic() {
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        new BlankFinalStatic();
    }
}  