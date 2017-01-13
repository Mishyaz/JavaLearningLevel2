package ex1;

public class Main {
    public static void main(String[] args) {
        NonGen intObject = new NonGen(12);
        NonGen strObject = new NonGen("hello");

        String s = (String) strObject.getObject();
        intObject = strObject;

        System.out.println(((Integer) intObject.getObject()));
    }
}
