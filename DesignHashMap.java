import java.util.HashMap;

public class DesignHashMap {
    private HashMap<Integer,Integer>map;

    public  void MyHashMap() {
        map=new HashMap<>();

    }

    public  void put(int key, int value) {
        map.put(key,value);


    }

    public int get(int key) {
        return map.getOrDefault(key,-1);

    }

    public void remove(int key) {
        map.remove(key);


    }
    public static void main(String[] args) {

    }
}
