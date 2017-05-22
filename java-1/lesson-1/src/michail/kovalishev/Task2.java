package michail.kovalishev;

import java.util.*;


class Task2 {
    public static double calc(
            int a,
            int b,
            int c,
            int d
    ) {
        //если передан в знаменателе дроби 0, то считаем
        //что конструкция с дробью равна 0
        if (d == 0) {
            return (a * b);
        } else {
            return (a * (b + ((float) c / d)));
        }
    }

    public static void main(String args[]) {
        System.out.println(
                "calc(1, 2, 3, 4) = "
                        + Task2.calc(1, 2, 3, 4));
        System.out.println(
                "calc(5, 7, 5, 2) = "
                        + Task2.calc(5, 7, 5, 2));
        System.out.println(
                "calc(2, 4, 9, 0) = "
                        + Task2.calc(2, 4, 9, 0));
    }
}
