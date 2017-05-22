package michail.kovalishev;

import java.util.*;


class Task3 {
    public static boolean checkInRange(
            int a,
            int b
    ) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        System.out.println(
                "checkInRange(3, 6) = "
                        + Task3.checkInRange(3, 6));
        System.out.println(
                "checkInRange(9, 10) = "
                        + Task3.checkInRange(9, 10));
        System.out.println(
                "checkInRange(11, 10) = "
                        + Task3.checkInRange(11, 10));
    }
}