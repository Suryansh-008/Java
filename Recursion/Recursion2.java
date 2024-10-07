package Recursion;

public class Recursion2 {

    public static void printFun(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printFun(n+1);
    }

    public static void main(String[] args) {

        int n=1;
        printFun(n);

    }
}
