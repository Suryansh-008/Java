package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program0 {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Suryansh Singh");
        studentsName.add("Harsh");
        studentsName.add("Gaurav");
        studentsName.add("Vedant");
        System.out.println(studentsName);

        studentsName.add(2,"Devesh");
        System.out.println(studentsName );

        ArrayList<String> newlist= new ArrayList<>();
        newlist.add("abc");
        newlist.add("efg");

        studentsName.addAll(newlist);
        System.out.println(studentsName);

        System.out.println(studentsName.get(0));

        studentsName.set(5,"xyz");
        System.out.println(studentsName);

        System.out.println(studentsName.contains("abc"));

        studentsName.remove(5);
        System.out.println(studentsName);

        studentsName.remove(String.valueOf("efg"));
        System.out.println(studentsName);

        studentsName.clear();
        System.out.println(studentsName);

    }
}
