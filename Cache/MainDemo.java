package Cache;

public class MainDemo {
    public static void main(String[] args) {

        System.out.println("=== FIFO Cache Demo ===");
        Cache fifo = new FIFOCache(3);
        fifo.put("a", 1);
        fifo.put("b", 2);
        fifo.put("c", 3);

        System.out.println("Initial FIFO: " + fifo); // a,b,c

        fifo.put("d", 4); // evicts "a"
        System.out.println("After put d (evict a): " + fifo);

        System.out.println("containsKey('b') => " + fifo.containsKey("b"));
        System.out.println("get('c') => " + fifo.get("c"));

        fifo.remove("b");
        System.out.println("After remove b: " + fifo);

        fifo.clear();
        System.out.println("After clear: size = " + fifo.size());


        System.out.println("\n=== LRU Cache Demo ===");
        Cache lru = new LRUCache(3);
        lru.put("a", 1);
        lru.put("b", 2);
        lru.put("c", 3);

        System.out.println("Initial LRU: " + lru);

        // Access "a" to make it MRU
        System.out.println("get('a') => " + lru.get("a"));

        // Insert "d" — should evict "b" (least recently used)
        lru.put("d", 4);

        System.out.println("After put d (evict least recently used): " + lru);
        System.out.println("size: " + lru.size());
        System.out.println("containsKey('b') => " + lru.containsKey("b"));
    }
}