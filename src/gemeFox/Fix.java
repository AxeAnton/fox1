package gemeFox;

public class Fix implements Common {
    private Converter converter;

    public Fix(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void run() {
        converter.writeToFile(Description.getResultFix());
        System.out.println("Игра сохранена");
    }
}

