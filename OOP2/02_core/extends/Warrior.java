package j0406;

public class Warrior extends Character implements Eatable {
    public Warrior(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    @Override
    public String attack() {
        return getName() + " is attacking with sword.";
    }

    public void eat() {
        super.hp += 100;
    }
}
