package map;

public class LinkedListTest {
    public static void main(String[] args) {
        SimpleList<String> list = new MyLinkedList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Size: " + list.size()); // Expected: 3
        System.out.println("Index 1: " + list.get(1)); // Expected: Python
        
        list.remove("Python");
        System.out.println("After remove, Size: " + list.size()); // Expected: 2
        System.out.println("After remove, Index 1: " + list.get(1)); // Expected: C++
    }
}
