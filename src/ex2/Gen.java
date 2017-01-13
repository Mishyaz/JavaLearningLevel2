package ex2;

//public class Gen0(T) { //метафора
public class Gen<T> {//параметризованный тип
    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
