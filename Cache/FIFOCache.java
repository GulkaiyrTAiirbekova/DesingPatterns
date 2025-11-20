package Cache;
//A simple FIFO eviction uses LinkedHashMap with insertion-order (accessOrder = false) and removeEldestEntry to evict the oldest entry when size > capacity.
import java.util.LinkedHashMap;
import java.util.Map;

public class FIFOCache implements Cache {
    private final int capacity;
    private final LinkedHashMap<String,Integer> map;

    public FIFOCache(int capacity){
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be > 0");
        this.capacity = capacity;
        //accessOrder = false -> insertion order (FIFO)
        this.map = new LinkedHashMap<String, Integer>(capacity, 0.75f, false) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest){
                return size() > FIFOCache.this.capacity;
            }
        };
    }

    @Override
    public synchronized void put(String key, int value) {
        map.put(key, value);
    }

    @Override
    public synchronized int get(String key){
        return map.get(key); //no access order change in FIFO
    }

    @Override
    public synchronized void remove (String key) {
        map. remove(key);

    }
    @Override
    public synchronized void clear(){
        map.clear();
    }

    @Override
    public synchronized int size(){
        return map.size();
    }

    @Override
    public synchronized boolean containsKey(String key) {
        return map.containsKey(key);
    }

    @Override
    public String toString(){
        return map.toString();
    }
}
//synchronized used to keep it thread-safe for simple concurrent use. Remove if concurrency isn't required.
//
//When put inserts and the cache exceeds capacity, the eldest (first inserted) entry is automatically removed.