package michail.kovalishev;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FindInFile {
    public static boolean findPhrase(String nameFile) {
        String phrase = inputPhrase();
        return findPhraseInFile(nameFile, phrase);
    }

    private static String inputPhrase() {
        System.out.print("Введите искомую фразу => ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean findPhraseInFile(String nameFile, String phrase) {
        FileReader fileReader = null;
        String path = "lesson-6/src/text/";
        int position = 0;
        int lastPosition = phrase.length() - 1;

        try {
            fileReader = new FileReader(path + nameFile);
            for (int read = fileReader.read(); read != -1; read = fileReader.read()) {
                //System.out.printf("read = '%s' position = %d charAt = '%s'\n", (char) read, position, phrase.charAt(position));
                if ((char)read == phrase.charAt(position)) {
                    if (position == lastPosition) {
                        return true;
                    }
                    position++;
                }
                else {
                    position = 0;
                    if ((char)read == phrase.charAt(position)) {
                        position++;
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("При поиске возникли ошибки.");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Выполняем поиск.");

        if (findPhrase("text3.txt")) {
            System.out.println("Фраза найдена.");
        }
        else {
            System.out.println("Фраза не найдена.");
        }
    }
}
