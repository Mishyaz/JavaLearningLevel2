package ex8;

public class Gen2<T extends Number> {
    T number;

    void foo() {
//        Gen2<Integer>[] integers;
//        integers = new Gen2<Integer>[3];
        Gen2<?>[] integers;
        integers = new Gen2<?>[3];

    }
}
