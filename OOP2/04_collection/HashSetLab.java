import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetLab {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<>(); // 기본 set
        // Set<String> set = new LinkedHashSet<>(); // 입력 순서를 기억하는 set
        Set<String> set = new TreeSet<>(); // 알파벳 순서로 정렬해주는 set

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        System.out.println(set);

        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        System.out.println(set);

        set.add("0range");
        System.out.println(set);

        if (set.contains("0range")) {
            System.out.println("있음");
            set.remove("0range");
            set.add("Orange");
        }

        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
