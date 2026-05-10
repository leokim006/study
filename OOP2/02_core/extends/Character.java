package j0406;

abstract public class Character {
    String name;
    int hp;
    int mp;
    int attackPower;

    public Character(String name, int hp, int mp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }

    // Getter
    public String getName() {
        return this.name;
    }
    public int getHP() {
        return this.hp;
    }
    public int getMP() {
        return this.mp;
    }
    public int getAttackPower() {
        return this.attackPower;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public void setMP(int mp) {
        this.mp = mp;
    }
    public void setAttacKPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // walk()
    public void walk() {
        System.out.println(this.name + " is walking");
    }

    // showStatus() => toString()
    public String toString() {
        return "Name: " + this.name + "\n" +
               "HP: " + this.hp + "\n" +
               "MP: " + this.mp + "\n" +
               "AttackPower: " + this.attackPower;
    }

    abstract public String attack();
}

