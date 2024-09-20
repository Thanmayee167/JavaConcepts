package polymorphism.finalkeyword;

public class BlankFinalConstructor {
    final int speedlimit;//blank final variable

    BlankFinalConstructor() {
        speedlimit = 70;
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        new BlankFinalConstructor();
    }
}  