package coffee;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c = new HouseBlend();
        Coffee latte = new Milk(new HouseBlend());
        Coffee greentea_latte = new Greentea(new Milk(new HouseBlend()));

        System.out.println(c.getDescription() + ": " + c.cost());
        System.out.println(latte.getDescription() + ": " + latte.cost());
        System.out.println(greentea_latte.getDescription() + ": " + greentea_latte.cost());
    }
}
