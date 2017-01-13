package ex2;

//public class Gen0(MyTemplate) { //метафора
public class Gen0<MyTemplate> {//параметризованный тип
    MyTemplate object;

    public Gen0(MyTemplate object) {
        this.object = object;
    }

    public MyTemplate getObject() {
        return object;
    }

    public void setObject(MyTemplate object) {
        this.object = object;
    }
}
