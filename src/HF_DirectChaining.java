import java.util.Hashtable;
import java.util.LinkedList;

public class HF_DirectChaining {

    private Hashtable<Integer, LinkedList> table;

    public HF_DirectChaining() {
        table = new Hashtable<Integer, LinkedList>();

    }


    public int sascii(String str, int mod) {
        int sum = 0;
        int key = 0;

        for(int i = 0; i < str.length(); i++) {
            //If you sum a char to an int, it will sum his ascii dec value
            sum += str.charAt(i);
        }

        key = sum % mod;

        LinkedList list;

        if(!table.containsKey(key)) {
            list = new LinkedList<String>();
            list.add(str);

            table.put(key, list);
            System.out.println(key + " : " + str + " added to map");
            return key;
        }

        System.out.println(key + " already in map, adding " + str + " to value");
        list = table.get(key);
        list.add(str);

        return key;
    }

    public void printTable() {
        System.out.println(table);
    }
}
