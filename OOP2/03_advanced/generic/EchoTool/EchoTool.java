package EchoTool;

public class EchoTool {
    public <T> T echo(T x) {
        return x;
    }

    /* <T>가 없었다면?
    public int echo(int x) {
        return x;
    }
    public String echo(String x) {
        return x;
    }
    public Double echo(double x) {
        return x;
    }
    */
}
