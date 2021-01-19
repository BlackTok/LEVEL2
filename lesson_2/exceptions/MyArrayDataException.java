package lesson_2.exceptions;

public class MyArrayDataException extends NumberFormatException {
    private int a,b;

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyArrayDataException(String s, int a, int b) {
        super(s);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
