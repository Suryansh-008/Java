import java.util.*;
public class String {
    
    public static void main(String[] args) {
       //java.lang.String name = "my name is Suryansh Singh";
      
        //System.out.println(name.substring(0, 1));
        java.lang.String firstName = "Tony";
       java.lang.String secondName = "Stark";
 
       java.lang.String fullName = firstName + " " + secondName;
 
       for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
       }

    }
}