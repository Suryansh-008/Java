package Sorting;

public class BubbleSort {
    public static void PrintArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={6,5,4,3,2,1};

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        PrintArray(a);
    }
}
// Using ArrayClass Function
// Arrays.sort(a);
//         for(int i : a){
//         System.out.print(i + " ");
//         }
