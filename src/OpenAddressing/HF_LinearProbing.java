package OpenAddressing;

import java.util.Hashtable;

public class HF_LinearProbing {

    private static Hashtable<Integer, String> table;

    public HF_LinearProbing() {
        table = new Hashtable<Integer, String>();
    }

    public int sascii(String str, int mod) {

        int sum = 0;
        int key = 0;

        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }

        key = sum % mod;

        System.out.println("Attempting to add " + str + " at position " + key + "...");
        key = addToTable(table, key, str);
        System.out.println();

        return key;

    }

    private int addToTable(Hashtable<Integer, String> table, int key, String str) {

        if(!table.containsKey(key)) {
            table.put(key, str);
            System.out.println(str + " added at position " + key);
            return key;
        }

        System.out.println("Position " + key + " already occupied. Trying with " + (key + 1));
        key = addToTable(table, key + 1, str);

        return key;


    }

    public void printTable() {
        System.out.println(table);
    }
}
