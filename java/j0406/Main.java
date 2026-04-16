package j0406;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("Warrior1", 100, 100, 1000);
        Mage    m = new Mage("Mage1", 80, 200, 500);
        Archor a = new Archor("Archor1", 90, 100, 750);
        // Character who = new Character("Who Are You", 999, 999, 9999);
        Cat c = new Cat();
        Dog d = new Dog();

        Character[] party = {w, m, a};
        Eatable[] animals = {w, m, a, c, d};

        for (Character member : party){
            member.walk();
            System.out.println(member.attack());
            System.out.println(member);
            System.out.println();
        }

        for (Eatable p : animals) {
            p.eat();
            System.out.println(p);
        }
    }
}
