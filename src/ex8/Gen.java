package ex8;

public class Gen<T, V> {
    T object1; // Т становится, например, Integer только на этапе компиляции. В runtime вместо Т будет Object
    V object2;

    T[] objects;

    //    static T someStaticObject;

    // стирание
//    void set(T object) {
//        object1 = object;
//    }
//
//    void set(V object) {
//        object1 = object;
//    }
//    void createNewObjects() {
//        object1 = new T();
//        object2 = new V();
//    }
    void createNewArray() {
//        objects = new T[100];
    }
}

//class ThrowableClass<T> extends Throwable {
//
//}
