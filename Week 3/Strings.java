class Strings{
    //pallindrome function
    static boolean isPallindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j)
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        return true;
    }
    public static void main(String args[]){
        //Code here
        String s1= "TabaT";
        System.out.print(isPallindrome(s1));
    }
}