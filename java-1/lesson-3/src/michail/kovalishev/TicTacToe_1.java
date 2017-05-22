package michail.kovalishev;

import java.util.Random;
import java.util.Scanner;

/**
 * Для себя. Игра крестики-нолики
 * Основные моменты:
 *  - инициализация поля; +
 *  - отрисовка поля; +
 *  - ввод игрока; +
 *  - проверка ввода игрока; +
 *  - ввод компьютера; +
 *  - проверка ввода компьютера; +
 *  - игровой цикл;
 *  - проверка выигрыша;
 *  - проверка ничьи.
 * Позиционирование:
 *  - x - это столбец
 *  - y - это строка
 */
public class TicTacToe_1 {
    private static char[][] fields = new char[3][3];

    private static char EMPTY = ' ';
    private static char PLAYER = 'X';
    private static char COMPUTER = 'O';
    private static char CURRENT = ' ';

    public static void main(String[] args) {
        initGame();
        drawFileds();
        boolean computerTurn = false;

        for (int turn = 0; turn < 9; turn++) {
            gameTurn(computerTurn);
            drawFileds();
            computerTurn = !computerTurn;
            if (checkWinCombination()) {
                System.out.println("Конец игры. Игрок [" + CURRENT + "] выиграл!");
                return;
            }
        }
        System.out.println("Конец игры. Ничья!");

    }

    private static void initGame() {
        CURRENT = EMPTY;
        for (int row = 0; row < fields.length; row++) {
            for (int col = 0; col < fields[row].length; col++) {
                fields[row][col] = EMPTY;
            }
        }
    }

    private static void drawFileds() {
        System.out.print("┏━━━┳━━━┳━━━┳━━━━┓\n");
        System.out.print("┃  ┃ 1 ┃ 2 ┃ 3 ┃\n");

        for (int row = 0; row < fields.length; row++) {
            System.out.print("┣━━━╋━━━╋━━━╋━━━━┫\n");
            System.out.print("┃ " + (row + 1) + "┃");
            for (int col = 0; col < fields[row].length; col++) {
                System.out.print(" ");
                System.out.print(fields[row][col]);
                System.out.print(" ┃");
            }
            System.out.print("\n");
        }
        System.out.print("┗━━━┻━━━┻━━━┻━━━━┛\n");
    }

    private static void gameTurn(boolean isComputer) {
        CURRENT = CURRENT == PLAYER ? COMPUTER : PLAYER;

        if (isComputer) {
            computerTurn();
        }
        else {
            playerTurn();
        }
    }

    private static void playerTurn() {
        int rowPosition = 0;
        int colPosition = 0;
        System.out.println("Ход игрока [" + CURRENT + "] " );

        while(true) {
            System.out.print("Введите позицию через пробел, строка и столбец (от 1 до 3) => " );
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                rowPosition = scanner.nextInt() - 1;
                if (rowPosition < 0 || rowPosition > 2) {
                    continue;
                }
            }
            else {
                continue;
            }
            if (scanner.hasNextInt()) {
                colPosition = scanner.nextInt() - 1;
                if (colPosition < 0 || colPosition > 2) {
                    continue;
                }
            }
            else {
                continue;
            }
            if (isBusyGiled(rowPosition, colPosition)) {
                continue;
            }
            fields[rowPosition][colPosition] = CURRENT;
            scanner = null;
            break;
        }
    }

    private static void computerTurn() {
        int rowPosition = 0;
        int colPosition = 0;
        Random random = new Random();
        System.out.println("Ход игрока [" + CURRENT + "] " );

        while(true) {
            rowPosition = random.nextInt(3);
            colPosition = random.nextInt(3);

            if (isBusyGiled(rowPosition, colPosition)) {
                continue;
            }
            fields[rowPosition][colPosition] = CURRENT;
            break;
        }
        System.out.println("Введите позицию через пробел, строка и столбец (от 1 до 3) => " + rowPosition + " " + colPosition );
    }

    private static boolean isBusyGiled(int row, int col) {
        return fields[row][col] != EMPTY;
    }

    private static boolean checkWinCombination() {
        /**
         * Прикинем количество вариантов для поля 3х3.
         *  - 3 варианта заполнения строки
         *  - 3 варианта заполнения столбца
         *  - главная и побочная диагонали
         * Всего получается 8 вариантов
         * В каждом варианте мы должны проверить 3 элемента. Попробуем цикл
         */
        int[] counts = new int[8];
        for (int i = 0; i < fields.length; i++) {
            // строки
            counts[0] += fields[0][i] == CURRENT ? 1 : 0;
            counts[1] += fields[1][i] == CURRENT ? 1 : 0;
            counts[2] += fields[2][i] == CURRENT ? 1 : 0;

            // столбцы
            counts[3] += fields[i][0] == CURRENT ? 1 : 0;
            counts[4] += fields[i][1] == CURRENT ? 1 : 0;
            counts[5] += fields[i][2] == CURRENT ? 1 : 0;

            // главная диагональ
            counts[6] += fields[i][i] == CURRENT ? 1 : 0;

            // побочная диагональ
            counts[7] += fields[i][fields.length - i - 1] == CURRENT ? 1 : 0;
        }

        for (int curCount: counts) {
            if (curCount == 3) {
                return true;
            }
        }

        return false;
    }
}
