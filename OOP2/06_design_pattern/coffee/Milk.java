package coffee;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee c) {
        super(c);
    }

    public String getDescription() {
        return c.getDescription() + " + Milk";
    }

    public double cost() {
        return c.cost() + 0.2;
    }
}
