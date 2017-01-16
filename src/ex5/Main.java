package ex5;

public class Main {
    public static void main(String[] args) {
        Gen1<Integer> i1 = new Gen1<>(20);
        Gen1<Integer> i2 = new Gen1<>(40);

        i1.showDelta(i2);

        Gen1<Float> f1 = new Gen1<>(20.0f);

        i1.showDelta(f1);
        f1.showDelta(i1);
    }
}
