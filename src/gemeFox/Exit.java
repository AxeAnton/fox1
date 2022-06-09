package gemeFox;

public class Exit implements Common {
    @Override
    public void run() {
        System.out.println("Конец игры");
        System.exit(0);
    }
}

