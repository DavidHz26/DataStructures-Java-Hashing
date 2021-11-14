import OpenAddressing.HF_DoubleHashing;
import OpenAddressing.HF_LinearProbing;
import OpenAddressing.HF_QuadraticProbing;

public class Main {
    public static void main(String[] args) {

        //If you are implementing hashing with an array, and your array gets full, create a new one of size
        //previous array * 2, then hash your values of first array and add them to the new array
        // this process can repeat Nth necessary times

        //To delete elements constantly, if you are using an array and you use open addressing remember to
        // restructure your array often, if not deletion will be a nightmare because
        // of empty spaces between elements

        HF_Numbers nums = new HF_Numbers();

        System.out.println(nums.numMod(500));

        System.out.println(nums.numMod(700));

        nums.printMap();

        System.out.println("--------------------");
        System.out.println("DIRECT CHAINING");

        HF_DirectChaining dc = new HF_DirectChaining();

        //The three of them point to the same space in table and that
        //is called a collision
        dc.sascii("ABCDEFG", 1);
        dc.sascii("PQRSTUV", 1);
        dc.sascii("MNOPQRS", 1);
        dc.sascii("QWERTY", 16);

        dc.printTable();


        System.out.println("--------------------");
        System.out.println("LINEAR PROBING");

        HF_LinearProbing lp = new HF_LinearProbing();

        lp.sascii("ABCDEFG", 1);
        lp.sascii("PQRSTUV", 1);
        lp.sascii("MNOPQRS", 1);
        lp.sascii("QWERTY", 16);

        lp.printTable();

        System.out.println("--------------------");
        System.out.println("QUADRATIC PROBING");

        HF_QuadraticProbing qp = new HF_QuadraticProbing();

        qp.sascii("ABCDEFG", 1);
        qp.sascii("PQRSTUV", 1);
        qp.sascii("MNOPQRS", 1);
        qp.sascii("QWERTY", 16);

        qp.printTable();

        System.out.println("--------------------");
        System.out.println("DOUBLE HASHING");

        HF_DoubleHashing dh = new HF_DoubleHashing();

        dh.function("ABCDEFG", 5);
        dh.function("PQRSTUV", 5);
        dh.function("MNOPQRS", 5);
        dh.function("QWERTY", 16);

        dh.printTable();

    }
}
