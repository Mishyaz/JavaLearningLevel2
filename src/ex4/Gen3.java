package ex4;

public class Gen3<T extends Animal & Miauable> {
    T object;

    public Gen3(T object) {
        this.object = object;
    }

    void show() {
        double d = object.doubleValue();
        System.out.println(d);
    }
}
