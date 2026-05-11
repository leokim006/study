package map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Collection;

public class HashMapTest {
    public static void main(String[] args) {
        // SimpleMap<String, Integer> map = new MyHashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        System.out.println("Size: " + map.size()); // Expected: 3
        System.out.println("Alice's age: " + map.get("Alice")); // Expected: 25
        
        map.put("Alice", 26); // Value Update
        System.out.println("Updated Alice's age: " + map.get("Alice")); // Expected: 26
        System.out.println("Contains Bob? " + map.containsKey("Bob")); // Expected: true

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        Iterator<Integer> it = values.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("value: " + i);
        }

        for (Integer v : values) {
            System.out.println("value: " + v);
        }

        Set<Entry<String, Integer>> table = map.entrySet();
        for (Entry<String, Integer> row : map.entrySet()) {
            System.out.println(row.getKey() + " " + row.getValue());
            if (row.getKey().compareTo("Bob") == 0) {
                row.setValue(row.getValue() + 100);
            }
            System.out.println(row.getKey() + " " + row.getValue());
        }

        Iterator<Entry<String, Integer>> iter = table.iterator();
        while (iter.hasNext()) {
            Entry<String, Integer> item = iter.next();
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
