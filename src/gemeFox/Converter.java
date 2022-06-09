package gemeFox;

import java.io.*;

public class Converter {
    private final File file;

    public Converter(File file) {
        this.file = file;
    }

    public void writeToFile(int num) {
        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(num);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }

    public String readFromFile() {
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("t.txt"));
            while ((line = bufferedReader.readLine()) != null) return line;

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        return null;
    }
}

