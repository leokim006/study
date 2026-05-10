package linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        System.out.println(list.size() + " " + list.isEmpty());
        list.add("Student1");
        System.out.println(list.size() + " " + list.isEmpty());
        list.add("Student2");
        System.out.println(list.size() + " " + list.isEmpty());
        list.add("Student3");
        System.out.println(list.size() + " " + list.isEmpty());
    }
}
