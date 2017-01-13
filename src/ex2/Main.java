package ex2;

import ex1.NonGen;

public class Main {
    public static void main(String[] args) {
//        NonGen(Integer) intObject = new NonGen(12); // метафора
        Gen0<Integer> intObject = new Gen0<>(12);
        Gen0<String> strObject = new Gen0<>("hello");

//        String s = (String) strObject.getObject(); // метафора
        String s = strObject.getObject();

//        intObject = strObject; нельзя!

        System.out.println(((Integer) intObject.getObject()));
    }
}
