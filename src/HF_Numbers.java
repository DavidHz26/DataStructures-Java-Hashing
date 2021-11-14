import java.util.Hashtable;

public class HF_Numbers {

    private Hashtable<Integer, Integer> table;

    public HF_Numbers() {
        table = new Hashtable<Integer, Integer>();
    }

    public int numMod(int number) {

        int key = number % 16;

        if(!table.containsKey(key)) {
            table.put(key, number);
            return key;
        } else {
            System.out.println("Key already in map");
        }

        return -1;
    }

    public void printMap() {
        System.out.println(table);
    }
}
