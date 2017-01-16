package ex5;

public class Gen1<T extends Number> {
    T number;

    public Gen1(T number) {
        this.number = number;
    }

//    void showDelta(Gen1 operand) {
//    void showDelta(Gen1<T> operand) {
    void showDelta(Gen1<?> operand) { //wildcards
//    void showDelta(Gen1<? extends Integer> operand) { //wildcards
        System.out.println(number.doubleValue() - operand.number.doubleValue());
    }
}
