import java.util.Scanner;
public class First {
    public static void main(String args[]){
        int a;
        int b;
        int c;
        System.out.println("enter your numbers");
        Scanner n = new Scanner(System.in);
        a=n.nextInt();
        b=n.nextInt();
        System.out.println("Enter 1 for sum \n 2 for substract \n 3 for multiply \n 4 for divide \n");
        
        c=n.nextInt();
        
        if (c==1) {
            System.out.println(a+b);
            }
        else if (c==2) {
            System.out.println(a-b);
            }
        else if (c==3) {
            System.out.println(a*b);
            }
        else if (c==4) {
            System.out.println(a/b);
            }
        else {
            System.out.println("error");
        }
    }

}








