package text;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextComponent st = new SimpleText("Simple");
        TextComponent bt = new BoldText(st);
        TextComponent it = new ItalicText(st);
        TextComponent ut = new UnderlineText(st);
        TextComponent bit = new ItalicText(new BoldText(st));
        TextComponent ibt = new BoldText(new ItalicText(st));
        TextComponent ubit = new UnderlineText(bit);

        List<TextComponent> list = new ArrayList<>();
        list.add(st);
        list.add(bt);
        list.add(it);
        list.add(ut);
        list.add(bit);
        list.add(ibt);
        list.add(ubit);

        for (TextComponent t : list) {
            System.out.println(t.getText());
        }
    }
}
