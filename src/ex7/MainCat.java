package ex7;

public class MainCat {
    public static void main(String[] args) {
        String[] strings = {"Catty", "Tom", "Cat"};
        MainCollection<String> mainCollection = new MainCollection<>(strings);
        System.out.println(mainCollection.min());

        Integer[] integers = {10, 2, 15, 20};
        MainCollection<Integer> mainCollection1 = new MainCollection<>(integers);
        System.out.println(mainCollection1.min());
    }
}
