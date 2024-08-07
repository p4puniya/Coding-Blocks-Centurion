class Recursion{
    static int factorial(int n){
        if(n==1) return 1;
        int fact= n* factorial(n-1);
        return fact;
    }

    // for x^p
    static int powerFunction(int x, int p){
        //recursive code
        if(p==0) return 1;
        int ans= x*powerFunction(x,p-1);
        return ans;
    }

    //tail recursion for factorial
    static int fact2(int n, int ans){
        if(n==0) return ans;
        return fact2(n-1, ans*n);
    }

    static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
    //print all subsequences
    static void subSeq(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch= s.charAt(0);
        //include ch in ans
        
        subSeq(s.substring(1),ans);
        subSeq(s.substring(1),ans+ch);
    }
    //Print all outcomes of a coin flip
    static void coinFlip(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinFlip(n-1, ans+"H");
        coinFlip(n-1, ans+"T");
    }

    static void gP(int n, int open, int close, String ans){
        if(open == n && close == n){
            System.out.println(ans+" ");
            return;
        }
        if(open>n||close>open)
            return;
        gP(n,open+1, close, ans+"(");
        gP(n,open, close+1, ans+")");
    }

    public static void main(String args[]){
        int n=5;
        gP(3, 0, 0, "");
        // System.out.print();
    }
}