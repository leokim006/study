package EchoTool;

public class Main {
    public static void main(String[] args) {
        EchoTool tool = new EchoTool();

        int i = tool.echo(10);
        String str = tool.echo("String0");

        System.out.println("i: " + i + " " + "str: " + str);
    }
}
