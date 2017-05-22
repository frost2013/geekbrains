package michail.kovalishev;


import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] testArray = {1, 5, 25, 6, 7, 11, 15, 25, 9, 19, 16, 6, 5, 11, 18, 10, 4, 1, 8, 13};
        checkMaxAndMin(testArray);
    }

    public static void checkMaxAndMin(int[] arrayIn) {
        System.out.println("Входящий массив - " + Arrays.toString(arrayIn));

        if (arrayIn.length > 0) {
            int max = arrayIn[0];
            int min = max;

            for (int element: arrayIn) {
                min = element < min ? element : min;
                max = element > max ? element : max;
            }

            System.out.println("Максимальный элемент массива = " + max);
            System.out.println("Минимальный элемент массива  = " + min);
        }
        else {
            System.out.println("Переданный массив пуст");
        }
    }
}
