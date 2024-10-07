package ArrayList;

import java.util.SortedSet;
import java.util.TreeSet;

public class Program3 {
    public static void main(String[] args) {
        SortedSet set= new TreeSet();

        set.add(100);
        set.add(102);
        set.add(101);
        set.add(104);
        set.add(103);
        set.add(109);
        set.add(108);
        set.add(106);
        set.add(105);
        set.add(107);
        System.out.println(set);
        System.out.println(set.headSet(105));
        System.out.println(set.tailSet(105));
        System.out.println(set.subSet(104,107));


    }


}
