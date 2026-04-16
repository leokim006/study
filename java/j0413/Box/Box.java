package Box;

class Box<E/*Elemnt*/> {
    private E data; // 어떤 데이터인지 상관 없이 담을 수 있게 Object로 선언.

    public Box(E e) {
        this.data = e;
    }

    public E getData() {
        return this.data;
    }

}
