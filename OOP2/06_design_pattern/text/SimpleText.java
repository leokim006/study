package text;

public class SimpleText implements TextComponent {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
