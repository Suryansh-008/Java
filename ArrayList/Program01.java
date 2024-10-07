package ArrayList;

import java.util.ArrayList;

public class Program01 {
    public static void main(String[] args) {
        ArrayList<String> StudentsName1 = new ArrayList<>();
        StudentsName1.add("Suryansh Singh");
        StudentsName1.add("Harsh");
        StudentsName1.add("Gaurav");
        StudentsName1.add("Vedant");
        System.out.println(StudentsName1);
        for (int i = 0; i < StudentsName1.size(); i++) {
            System.out.println("--"+ StudentsName1.get(i));
        }

    }




}
