package NumberBox;

public class NumberBox<N extends Number> {
    private N data;

    public NumberBox(N data) {
        this.data = data;
    }

    public double sqrt() {
        return Math.sqrt(this.data.doubleValue());
    }
}
