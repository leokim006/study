package map;

public class MyLinkedList<E> implements SimpleList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(E element) {
        // TODO: 리스트의 끝에 새로운 노드를 추가하는 로직을 구현하시오.
    }

    @Override
    public E get(int index) {
        // TODO: 주어진 인덱스의 데이터를 반환하는 로직을 구현하시오. (인덱스 범위 체크 포함)
        return null;
    }

    @Override
    public boolean remove(E element) {
        // TODO: 특정 데이터를 찾아 삭제하고 연결을 재구성하는 로직을 구현하시오.
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
