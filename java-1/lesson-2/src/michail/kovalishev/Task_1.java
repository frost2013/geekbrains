package michail.kovalishev;


import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 0, 0, 0, 1, 0, 1};

        System.out.println("Массив до изменения = " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }

        System.out.println("Массив после изменения = " + Arrays.toString(array));
    }
}
