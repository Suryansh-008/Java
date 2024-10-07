package Recursion;

public class Recursion6 {
    public static int calcPower(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }

        int temp=calcPower(x,n-1);
        return x*temp;
    }
    public static void main(String[] args) {
        int x=2,n=5;

        System.out.println(calcPower(x,n));
    }
}
