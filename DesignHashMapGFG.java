import java.util.HashMap;

public class DesignHashMapGFG {
    private HashMap<Integer,Integer>map;


    void MyHashMap() {
        map=new HashMap<>();
        return;

    }


    void put(int key, int value) {
        map.put(key,value);
    }


    int get(int key) {
        return map.getOrDefault(key,-1);

    }


    void remove(int key) {
        map.remove(key);

    }
}

