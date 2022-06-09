package gemeFox;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Checklist {
    private final HashMap<Integer, Common> buttons;
    private File file;
    private Converter converter;
    private Scanner scanner;

    public Checklist() {
        this.file = new File("t.txt");
        this.converter = new Converter(file);
        this.buttons = new HashMap<>();
        buttons.put(1, new Start());
        buttons.put(2, new Load(converter));
        buttons.put(3, new Exit());
        buttons.put(4, new Fix(converter));
    }


    public void pushButton(int numberButton) {
        buttons.get(numberButton).run();

    }

    public void go() {
        scanner = new Scanner(System.in);
        backChecklist();
        while (true) {
            int n = scanner.nextInt();

            if (n > 0 && n < 4) {
                pushButton(n);
                if (Description.isFix()) {
                    pushButton(4);
                }
                backChecklist();
            } else System.out.println("Ошибка ввода данных");
        }

    }


    private void backChecklist() {
        System.out.println("Выбрать:\n" +
                "1. Начать игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти");
    }
}


