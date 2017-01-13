package ex3;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> object = new Gen<>(12, "hello");
        System.out.println(object);
    }
}
