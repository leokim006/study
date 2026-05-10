package linked_list;

public class Node<E> {
    E data;
    Node<E> next; // nested class?

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
