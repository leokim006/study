public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(food + "를 먹습니다.");
    }
    public abstract void sound();
}
