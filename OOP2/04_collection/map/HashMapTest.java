import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {
    public static void main(String[] args) {
        SimpleMap<String, Integer> map = new MyHashMap<>();
        // Map<String, Integer> map = new TreeMap<>();
        
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        System.out.println("Size: " + map.size()); // Expected: 3
        System.out.println("Alice's age: " + map.get("Alice")); // Expected: 25
        
        map.put("Alice", 26); // Value Update
        System.out.println("Updated Alice's age: " + map.get("Alice")); // Expected: 26
        System.out.println("Contains Bob? " + map.containsKey("Bob")); // Expected: true
    }
}
