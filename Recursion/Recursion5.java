package Recursion;

public class Recursion5 {
    public static int printFib(int n){
        if(n<=1){
            return n;
        }
        return printFib(n-1) + printFib(n-2);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(printFib(n));
    }
}
