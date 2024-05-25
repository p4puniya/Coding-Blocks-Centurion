import java.util.*;
class Bsearch{
    public static boolean check(int[] arr, int pages, int s){
        int currStudent=1;
        int cSum=0;
        for(int i: arr){
            if(cSum+i<=pages)
                cSum+=i;
            else{
                currStudent++;
                if(currStudent>s || i>pages)
                    return false;
                cSum=i;
            }
        }
        return true;
    }

    public static int space(int[] book, int s){x
        int ans=-1;
        int i=0,j=Arrays.stream(book).sum();
        while(i<=j){
            int mid=i+(j-i)/2;
            if(check(book,mid,s)){
                ans=mid;
                j=mid-1;
            }
            else
                i=mid+1;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        System.out.print(space(arr,2));
    }
}