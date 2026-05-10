import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); // ArrayList로 선언해도 가능함. 여기는 안되고 아래줄!!!!!(List로 선언했을 때) vector도 되고 stack도 되고..
        // List<String> list = new LinkedList<>(); + import java.util.List;

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println(list);

        list.add(3, "0range");
        list.addFirst("Peach");
        System.out.println(list);

        int index = list.indexOf("0range");
        for (int i = 0; i < list.size(); ++i) {
            String obj = list.get(i); // Object
            if (obj.compareTo("0range") == 0) {
                list.set(index, "Orange");
            }
        }
        list.set(index, "Orange");

        System.out.println(list);

        // 삭제
        list.remove(0);
        list.remove("Cherry");
        System.out.println(list);

        // 완전 초기화
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
