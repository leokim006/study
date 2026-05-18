package coffee;

public class Greentea extends CoffeeDecorator {
    public Greentea(Coffee c) {
        super(c);
    }

    public String getDescription() {
        return c.getDescription() + " + GreenTea";
    }

    public double cost() {
        return c.cost() + 0.3;
    }
}
