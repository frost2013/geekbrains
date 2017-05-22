package michail.kovalishev;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe_2 {
    static char[][] field = new char[3][3];
    static final char playerDot = 'X';
    static final char aiDot = 'O';
    static final char emptyDot = '*';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            playerTurn();
            printField();
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(playerDot)) {
                System.out.println("Победил человек");
                break;
            }
            aiTurn();
            printField();
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(aiDot)) {
                System.out.println("Победил компьютер");
                break;
            }
        }
    }

    public static boolean checkWin(char _xo) {
        int[] counts = new int[8];
        for (int i = 0; i < field.length; i++) {
            // строки
            counts[0] += field[0][i] == _xo ? 1 : 0;
            counts[1] += field[1][i] == _xo ? 1 : 0;
            counts[2] += field[2][i] == _xo ? 1 : 0;
            // столбцы
            counts[3] += field[i][0] == _xo ? 1 : 0;
            counts[4] += field[i][1] == _xo ? 1 : 0;
            counts[5] += field[i][2] == _xo ? 1 : 0;
            // главная диагональ
            counts[6] += field[i][i] == _xo ? 1 : 0;
            // побочная диагональ
            counts[7] += field[i][field.length - i - 1] == _xo ? 1 : 0;
        }

        for (int curCount: counts) {
            if (curCount == 3) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == '*') return false;
            }
        }
        return true;
    }

    public static void initField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '*';
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void setXO(int _x, int _y, char _xo) {
        field[_y][_x] = _xo;
    }

    public static boolean isCellEmpty(int _x, int _y) {
        if (_x < 0 || _y < 0 || _x > 2 || _y > 2) return false;
        if (field[_y][_x] == '*')
            return true;
        return false;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y (1-3)");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setXO(x - 1, y - 1, playerDot);
    }

    static Random rand = new Random();

    public static void aiTurn() {
        if (!checkPlayerTurnsAndPlaceAI()) {
            int x, y;
            do {
                x = rand.nextInt(3);
                y = rand.nextInt(3);
            } while (!isCellEmpty(x, y));
            setXO(x, y, aiDot);
        }
    }

    public static boolean checkPlayerTurnsAndPlaceAI() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == playerDot) {
                    return checkAroundAndPlace(i, j, playerDot, aiDot);
                }
            }
        }
        return false;
    }

    public static boolean checkAroundAndPlace(int row, int col, char check, char place) {
        if ((row - 1) >= 0 && field[row - 1][col] == check) {
            if ((row - 2) >= 0 && isCellEmpty(row - 2, col)) {
                setXO(row - 2, col, place);
                return true;
            }
        }
        if ((row - 1) >= 0 && (col + 1) <= 2 && field[row - 1][col + 1] == check) {
            if ((row - 2) >= 0 && (col + 2) <= 2 && isCellEmpty(row - 2, col + 2)) {
                setXO(row - 2, col + 2, place);
                return true;
            }
        }
        if ((col + 1) <= 2 && field[row][col + 1] == check) {
            if ((col + 2) <= 2 && isCellEmpty(row, col + 2)) {
                setXO(row, col + 2, place);
                return true;
            }
        }
        if ((row + 1) <= 2 && (col + 1) <= 2 && field[row + 1][col + 1] == check) {
            if ((row + 2) <= 2 && (col + 2) <= 2 && isCellEmpty(row + 2, col + 2)) {
                setXO(row + 2, col + 2, place);
                return true;
            }
        }
        if ((row + 1) <= 2 && field[row + 1][col] == check) {
            if ((row + 2) <= 2 && isCellEmpty(row + 2, col)) {
                setXO(row + 2, col, place);
                return true;
            }
        }
        if ((row + 1) <= 2 && (col - 1) >= 0 && field[row + 1][col - 1] == check) {
            if ((row + 2) <= 2 && (col - 2) >= 0 && isCellEmpty(row + 2, col - 2)) {
                setXO(row + 2, col - 2, place);
                return true;
            }
        }
        if ((col - 1) >= 0 && field[row][col - 1] == check) {
            if ((col - 2) >= 0 && isCellEmpty(row, col - 2)) {
                setXO(row, col - 2, place);
                return true;
            }
        }
        if ((row - 1) >= 0 && (col - 1) >= 0 && field[row - 1][col - 1] == check) {
            if ((row - 2) >= 0 && (col - 2) >= 0 && isCellEmpty(row - 2, col - 2)) {
                setXO(row - 2, col - 2, place);
                return true;
            }
        }
        return false;
    }
}