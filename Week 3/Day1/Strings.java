import java.util.*;
class Strings{
    //pallindrome function
    static boolean isPallindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j)
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        return true;
    }


    // Find the longest good substring
    public static String reverse(String s){
        s.trim();
        String[] arr= s.split("\s+");
        String ans="";
        for(int i=arr.length-1; i>=0;i--)
            ans+=arr[i]+" ";
        return ans.trim();
    }

    public static void main(String args[]){
        //Code here
        String s1= "The class is sleepy today";
        System.out.print(reverse(s1));
    }
}