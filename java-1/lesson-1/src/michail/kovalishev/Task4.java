package michail.kovalishev;

import java.util.*;


class Task4 {
    public static boolean checkYear(
            int year
    ) {
        year = Math.abs(year);

        if (year == 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(
                "checkYear(0) = "
                        + Task4.checkYear(0));
        System.out.println(
                "checkYear(100) = "
                        + Task4.checkYear(100));
        System.out.println(
                "checkYear(400) = "
                        + Task4.checkYear(400));
        System.out.println(
                "checkYear(396) = "
                        + Task4.checkYear(396));
        System.out.println(
                "checkYear(527) = "
                        + Task4.checkYear(527));
        System.out.println(
                "checkYear(8) = "
                        + Task4.checkYear(8));


        System.out.println(
                "checkYear(-100) = "
                        + Task4.checkYear(-100));
        System.out.println(
                "checkYear(-200) = "
                        + Task4.checkYear(-200));
        System.out.println(
                "checkYear(-400) = "
                        + Task4.checkYear(-400));
        System.out.println(
                "checkYear(-398) = "
                        + Task4.checkYear(-398));
        System.out.println(
                "checkYear(-8) = "
                        + Task4.checkYear(-8));
    }
}