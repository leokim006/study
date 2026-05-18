package text;

abstract class TextDecorator implements TextComponent {
    protected TextComponent text;

    public TextDecorator(TextComponent text) {
        this.text = text;
    }

    // getText()
}
