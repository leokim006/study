package map;

public interface SimpleList<E> {
    void add(E element);
    E get(int index);
    boolean remove(E element);
    int size();
}
