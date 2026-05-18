package text;

public class UnderlineText extends TextDecorator {
    public UnderlineText(TextComponent text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<under>" + text.getText() + "</under>";
    }
}
