package michail.kovalishev;


import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int length = 10;
        int i = 1;
        int delta = 3;
        int[] array = new int[length];
        array[0] = 1;

        for ( ; i < length; i++) {
            array[i] = array[i - 1] + delta;
        }

        System.out.println("Сгенерированный массив - " + Arrays.toString(array));
    }
}
