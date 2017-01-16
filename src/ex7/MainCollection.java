package ex7;

public class MainCollection<T extends Comparable<T>> implements Minimum<T> {
//public class MainCollection<T extends Comparable<T> & Minimum<T>> {
    T[] objects;

    public MainCollection(T[] objects) {
        this.objects = objects;
    }

    @Override
    public T min() {
        if (objects == null || objects.length < 1) {
            return null;
        }
        T m = objects[0];

        for (T object : objects) {
            if (object.compareTo(m) < 0) {
                m = object;
            }
        }
        return m;
    }
}
