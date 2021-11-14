package OpenAddressing;

import java.util.Hashtable;

public class HF_QuadraticProbing {

    private Hashtable<Integer, String> table;

    public HF_QuadraticProbing() {
        table = new Hashtable<Integer, String>();
    }

    public int sascii(String str, int mod) {
        int sum = 0;
        int key = 0;
        int sqrNumber = 1;

        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }

        key = sum % mod;


        System.out.println("Attempting to add " + str + " at position " + key);
        key = tableContains(table, key, str, sqrNumber);
        System.out.println();


        return key;
    }

    private int tableContains(Hashtable<Integer, String> table, int key, String str, int squareNumber) {
        if(!table.containsKey(key)) {
            table.put(key, str);
            System.out.println(str + " added at position " + key);
            return key;
        }

        System.out.println("Position " + key + " already occupied. Trying with " + (key + (int) Math.pow(squareNumber, 2) + "..."));
        key = tableContains(table, key + (int) Math.pow(squareNumber, 2), str, squareNumber + 1);

        return key;
    }

    public void printTable() {
        System.out.println(table);
    }
}
