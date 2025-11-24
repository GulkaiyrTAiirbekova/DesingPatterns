package Cache;

//1.Cache.Cache key is a string
//2. Cache.Cache value is integer
//3. implement functions of a Cache.Cache
// a. void put(string key. int value)
// b. int get(string key)
// c. void remove (string key)
// d.optional
//    d1. void clear()
//    d2. int size()
//    d3. boolean containsKey(string key)
//4. implement FIFO(first-in-first-out) or LRU(least recently used) pr (LFU(least frequently used)
//5. write README.md file for reviewers
public interface Cache {
    void put (String key, int value);
    int get(String key);
    void remove(String key);
    void clear();
    int size();
    boolean containsKey( String key);
}
