package j0406;

public class Mage extends Character implements Eatable {
    public Mage(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    @Override
    public String attack() {
        return getName() + " is attacking with magic.";
    }

    public void eat() {
        super.hp += 100;
    }
}
