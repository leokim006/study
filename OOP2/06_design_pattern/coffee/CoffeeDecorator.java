public class CoffeeDecorator extends Coffee {
    Coffee c;

    public CoffeeDecorator(Coffee c) {
        this.c = c;
    }

    abstract public double cost();
}
