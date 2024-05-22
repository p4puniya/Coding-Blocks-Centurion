public class Arrays {
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     findSum(arr);
// }
    public static int findSum(int[] arr, int start, int end){
        int sum=0;
        //end<arr.length and start>=0
        //traversal over a range
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }

    // public static int findNum(int[] arr, int start, int end, int num){
    //     for(int i=start;i<=end;i++){
    //         if(num==arr[i])
    //             return i;
    //     }
    //     return -1;
    // }

    // public static int findLargest(int[] arr, int start, int end){
    //     int temp=arr[0];
    //     for(int i=start;i<=end;i++){
    //         if(temp<arr[i]) temp=arr[i];
    //     }
    //     return temp;
    // }

    // public static void reverse(int[] arr){
    //     int i=0,j=arr.length-1;
    //     while(i<j){
    //         //swap
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;j--;
    //     }
    // }

// Window Size question
        //Window Size =3: j-i+1=3
        // int i=0,j=2;
        // int sum=0;
        // while(j<arr.length){
        //     //logic
        //     int tempSum=findSum(arr,i,j);
        //     sum= Math.max(tempSum, sum);
        //     i++;j++;
        // }
        // System.out.println("Our Max Sum is: "+ sum);
    public static void shiftByOne(int[] arr){
        int temp= arr[arr.length-1];
        for(int i=arr.length-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        printArr(arr);
    }

    public static void shiftByD(int[] arr, int d){
        //temp array created
        int []temp= new int[d];
        //values stored in temp
        for(int i=0;i<d;i++)
            temp[i]=arr[i+(arr.length-d)];
        //shifting
        for(int i=arr.length-1; i>=d;i--){
            arr[i]=arr[i-d];
        }
        //storing temp values back in original array
        for(int i=0;i<d;i++)
            arr[i]=temp[i];
        //printing the whole array
        printArr(arr);
    }

    static void printArr(int[] arr){
        //for each loop
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,8,3,2,6,4,7,1,4,5};
        int D=10;
        D%=arr.length;
        shiftByD(arr,D);
    }
}

