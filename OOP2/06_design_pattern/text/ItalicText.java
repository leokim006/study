package text;

public class ItalicText extends TextDecorator {
    public ItalicText(TextComponent text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<it>" + text.getText() + "</it>";
    }
}
