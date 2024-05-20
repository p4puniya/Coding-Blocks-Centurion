import java.util.Scanner;
public class Arrays_1 {
    public static void main(String[] args) {
        // int num1=1;
        // int num2=2;
        // int num3=3;
        // int num4=4;
        // int num5=5;
        // int num6=6;
        // int num7=7;
        // int num8=8;
        // System.out.println(num1);
        //boiler plate code is a code that's repeated 
        // and it's a bad practice
        //Data Structure: Arrays
        // int[] arr= new int[7];
        // int []arr2= {1,2,3,4,5,0};
        // System.out.println(arr2.length);

        // System.out.println(arr);
        // System.out.print(arr2[3]);

        // Scanner pragya= new Scanner(System.in);

//Pragya Bharti
        // for(int i=0; i<arr.length;i++){
        //     arr[i]=pragya.nextInt();
        // }
// Hari Shankar


        int arr[]= {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        swap(arr, 1, 2);
        // System.out.println(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
    static void swap(int []arr2, int a,int b){
        // System.out.println(arr2);
        int temp= arr2[a];
        arr2[a]=arr2[b];
        arr2[b]=temp;
    }

    static int sum(int a, int b){
        int s= a+b;
        return s;
    }
}
