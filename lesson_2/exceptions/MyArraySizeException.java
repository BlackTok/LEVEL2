package lesson_2.exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int size;

    public MyArraySizeException(String s, int size) {
        super(s);
        this.size = size;
    }

    public MyArraySizeException(int index, int size) {
        super(index);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
