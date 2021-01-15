package lesson_2;

import lesson_2.exceptions.MyArrayDataException;
import lesson_2.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"12","1","22","4"},
                {"12","5","22","4"},
                {"12","1","22","4"},
                {"12","1","22","4"}
        };

        int sum = getSumAllElements(arr);

        System.out.println(sum);
    }

    /**
     * @param arr принимает строковый массив размером 4х4
     * @exception MyArraySizeException выбрасывает исключение, если массив не соответствует заданным размерам
     * @exception MyArrayDataException выбрасывает исключение, если элемент массива нельзя преобразовать в число
    */
    public static int getSumAllElements(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;

        if (arr.length != 4)
            throw new MyArraySizeException("Размер основного массива не соответствует. " + arr.length, arr.length);

        for (int e = 0; e < arr.length; e++) {
            if (arr[e].length != 4)
                throw new MyArraySizeException("Размер вложенного массива " + e + " не соответствует. " + arr[e].length, arr[e].length);
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                try {
                    sum += Integer.parseInt(arr[a][b]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не правильный элемент массива. Строка " + a + ", столбец " + b, a, b);
                }
            }
        }

        return sum;
    }
}
