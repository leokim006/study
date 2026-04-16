package j0406;

public class Archor extends Character implements Eatable{
    public Archor(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    @Override
    public String attack() {
        return getName() + " is attacking with bow.";
    }

    public void eat() {
        super.hp += 100;
    }
}
