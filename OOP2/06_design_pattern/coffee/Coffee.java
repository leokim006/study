package coffee;

public abstract class Coffee {
    protected String description;
    
    public String getDescription() {
        return description;
    }

    abstract double cost();
}
