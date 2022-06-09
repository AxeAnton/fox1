package gemeFox;

public class Load implements Common {

    private final Converter converter;

    public Load(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void run() {
        String string = converter.readFromFile();
        int n = Integer.parseInt(string);
        Description.play (n);
    }
}
