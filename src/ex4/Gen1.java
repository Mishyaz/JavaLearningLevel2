package ex4;

public class Gen1<T extends Number> {
    T object;

    public Gen1(T object) {
        this.object = object;
    }

    void show() {
        double d = object.doubleValue();
        System.out.println(d);
    }
}
