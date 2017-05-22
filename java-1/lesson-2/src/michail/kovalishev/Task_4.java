package michail.kovalishev;


import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static int inputIntegerValue(int countsLeft, Scanner scanner) {
        int returnValue = 0;
        System.out.print("Попытка (" + countsLeft + ") => ");

        // смотрим, написали ли что
        while (scanner.hasNext()) {
            // проверяем, написал ли целое число
            if (scanner.hasNextInt()) {
                // считываем число. если введено несколько - в расчет берется число до первого пробела
                returnValue = scanner.nextInt();
                // считываем строку до конца, отбрасывая остальные символы, и переводим каретку на следующую строку
                scanner.nextLine();

                // проверяем диапазон
                if (returnValue >= 0 && returnValue < 10) {
                    break;
                }
            }

            scanner.nextLine();

            System.out.print("Неправильно. Еще раз => ");
        }

        return returnValue;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // загаданное число
        int magicNumber = random.nextInt(10);
        // число попыток угадать
        int countGuess = 3;
        // число пройденных попыток
        int countsLeft = 1;
        // статус игры
        boolean isWin = false;

        System.out.println("Я загадал число. У вас есть " + countGuess + " попытки отгадать.");

        do {
            int enteredValue = Task_4.inputIntegerValue(countsLeft, scanner);

            if (magicNumber == enteredValue) {
                System.out.println("Вы угадали число. Поздравляю!");
                isWin = true;
                break;
            }
            if (enteredValue < magicNumber) {
                System.out.println("Загаданное число больше.");
            }
            else {
                System.out.println("Загаданное число меньше.");
            }

            countsLeft++;
        } while (countsLeft <= countGuess);

        scanner.close();

        if (!isWin) {
            System.out.println("К сожалению, вам не удалось угадать число. До свидания!");
        }
    }
}
