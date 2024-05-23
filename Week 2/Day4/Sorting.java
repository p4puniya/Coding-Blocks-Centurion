import java.util.*;
public class Sorting{
    //Create a swap function
    //Krishna
    //Pushpam
    //Pratima
    //Anukriti
    //Gaurav
    //Shivam
    //Saurav
    //Priyanshu
    //Nikita
    //Suraj
    //
    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printArr(int[] arr){
        //for each loop
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }

    //bubble sort
    public static void bubbleSort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1])
                swap(arr,i,i+1);
            }
        }
    }
    //selection sort
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx= minIdx(arr,i);
            swap(arr,i,idx);
        }
    }
    public static int minIdx(int[] arr,int i){
        int minIndex= i;
        for(int j=i+1;j<arr.length;j++)
            if(arr[j]<arr[minIndex])
                minIndex=j;
        return minIndex;
    }
    //insertion sort
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    //none
    public static void main(String[] args){
        int[] arr={1,2,8,9,10,3,4,5,6,7};
        // bubbleSort(arr);
        // insertionSort(arr);
        Arrays.sort(arr);
        printArr(arr);
    }
}