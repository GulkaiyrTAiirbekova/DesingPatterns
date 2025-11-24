package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache implements Cache {
    private final int capacity;
    private final LinkedHashMap<String, Integer> map;

    public LRUCache(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be > 0");
        this.capacity = capacity;

        // accessOrder = true -> LRU behavior
        this.map = new LinkedHashMap<String, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }  // ← YOU FORGOT THIS BRACE

    @Override
    public synchronized void put(String key, int value) {
        map.put(key, value);
    }

    @Override
    public synchronized int get(String key) {
        return map.get(key); // accessOrder = true moves entry to MRU
    }

    @Override
    public synchronized void remove(String key) {
        map.remove(key);
    }

    @Override
    public synchronized void clear() {
        map.clear();
    }

    @Override
    public synchronized int size() {
        return map.size();
    }

    @Override
    public synchronized boolean containsKey(String key) { // FIXED SPELLING
        return map.containsKey(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

