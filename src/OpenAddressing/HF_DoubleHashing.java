package OpenAddressing;

import java.util.Hashtable;

public class HF_DoubleHashing {

    private Hashtable<Integer, String> table;

    public HF_DoubleHashing() {
        table = new Hashtable<Integer, String>();
    }

    public void function(String str, int mod) {
        int sum = 0;
        int key = 0;
        int cont = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }

        key = sum % mod;   //this is a number [0, 1, 2,....n]

        System.out.println("Attempting to add " + str + " at position " + key);
        addToTable(table, key, cont, str);
        System.out.println();

    }

    private void addToTable(Hashtable<Integer, String> table, int key, int cont, String str) {
        int doubleH = hash1(key, 13) + (cont * hash2(key, 7));

        if(!table.containsKey(doubleH)) {
            System.out.println(str + " added at position " + doubleH);
            table.put(doubleH, str);
            return;
        }

        System.out.println(doubleH + " already occupied. Double Hashing " + key + " again.");
        addToTable(table, key, cont + 1, str);
    }

    private int hash1(int key, int mod) {

        return key % mod;

    }

    private int hash2(int key, int mod) {

        return mod - key % mod;

    }

    public void printTable() {
        System.out.println(table);
    }
}
