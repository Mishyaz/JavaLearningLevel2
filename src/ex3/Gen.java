package ex3;

public class Gen<K, V> { //T, K, V, E
    K object1;
    V object2;

    public Gen(K object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public K getObject1() {
        return object1;
    }

    public void setObject1(K object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }
}
