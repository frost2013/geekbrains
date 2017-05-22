package michail.kovalishev;

import java.io.*;

public class SplitFiles {
    public static boolean split2Files(String pathFile1, String pathFile2, String resultFile) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        String path = "lesson-6/src/text/";

        try {
            outputStream = new FileOutputStream( path + resultFile);

            inputStream = new FileInputStream(path + pathFile1);
            for (int read = inputStream.read(); read != -1; read = inputStream.read()) {
                outputStream.write(read);
            }
            inputStream.close();

            inputStream = new FileInputStream(path + pathFile2);
            for (int read = inputStream.read(); read != -1; read = inputStream.read()) {
                outputStream.write(read);
            }
            inputStream.close();
            outputStream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Выполняем копирование.");
        if (split2Files("text1.txt", "text2.txt", "text3.txt")) {
            System.out.println("Копирование завершено успешно.");
        }
        else {
            System.out.println("При копировании произошли ошибки.");
        }
    }
}
