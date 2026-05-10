package linked_list;

public class MyLinkedList<E> implements MyCollection<E> {
    int numOfEmplements = 0;
    static Node<E> head = null;

    @Override
    public int size() {
        return numOfEmplements;
    }

    @Override
    public boolean isEmpty() {
        return numOfElements == 0;
        // return head == null;
    }

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node<E>(e);
        } else {
            newNode = new Node<E>(e);
            Node<E> cur = head;
            while(cur != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }

        numOfElemets++;
        return true;
    }
}
