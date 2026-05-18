package text;

public class BoldText extends TextDecorator {
    public BoldText(TextComponent text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<b>" + text.getText() + "</b>";
    }
}
