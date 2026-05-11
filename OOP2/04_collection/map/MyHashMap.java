package map;

public class MyHashMap<K, V> implements SimpleMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] table;
    private int size;

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    @Override
    public void put(K key, V value) {
        // TODO: 해시 함수를 사용하여 버킷에 데이터를 저장하는 로직을 구현하시오.
        // (해시 충돌 시 Chaining 방식으로 연결 리스트를 활용하시오.)
        int index = hash(key);
        Node<K, V> head = table[index];

        // 마지막 노드로 이동
        while (head.next == null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            } else {
                head = head.next;
            }
        }

        Node<K, V> newNode = new Node<>(key, value);
        head.next = newNode;
    }

    @Override
    public V get(K key) {
        // TODO: 키를 기반으로 버킷을 찾아 값을 반환하는 로직을 구현하시오.
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        // TODO: 특정 키가 맵에 존재하는지 확인하는 로직을 구현하시오.
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
