package ArrayList;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);


        Boolean boolean1=list.contains(2);


        //get Elements
        int elements = list.get(1);
        System.out.println(list);

        //Add element in b/w
        list.add(1,5);
        System.out.println(list);

        //set Element
        list.set(0,4);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(list);

        //loop

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //Sorting
        Collections.sort(list);
        System.out.println(list);

        int x=list.indexOf(2);
        System.out.println(x);

        list.clear();


        list.isEmpty();




    }
}
