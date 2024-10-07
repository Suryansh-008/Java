package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 56, 76, 45, 89, 554, 876, 35, 12, 7654, 677, 5434567, 565, 0);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println(Collections.frequency(list, 12));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.swap(list, 0, 1);
        System.out.println(list);


        /* *****************************************
        List<Integer> list2= new ArrayList<Integer>();

        list.add(234);

        Collections.copy(list,list2);
        System.out.println(list2);
        *********************************************

        */

        Collections.replaceAll(list,12,24);
        System.out.println(list);


    }

}

