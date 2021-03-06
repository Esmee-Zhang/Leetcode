package Special;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Esmee Zhang
 * @date 7/23/20 11:27 上午
 * @projectName Leetcode
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {

    /*
    * method 1
    * Ordered dictionary
    * */

    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;


    }

    public int get(int key) {
        return super.getOrDefault(key, -1);

    }

    public void put(int key, int value) {
        super.put(key, value);

    }

    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }

    /*
    * hashmap + double LinkedList
    * */
}
