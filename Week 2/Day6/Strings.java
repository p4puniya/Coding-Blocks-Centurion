class Strings{
    public static void main(String[] arg){
        // String s0= "He";
        // String s1= "Hello";
        // s1+="w";
        // System.out.print(s0);
        // String s2= new String(s1);
        // String s3= new String("Hello");
        // String s4=s0+s1;
        // System.out.print(s4==s3);

        String s= "Hello";
        String t= new String("Hello");

        System.out.print(comp(s,t));
    }
    // 0   : s1==s2 
    // +ve : s1.value/length > s2.value/length
    // -ve : s1.value/length < s2.value/length
    public static int compare(String s1, String s2){
        if(s1==s2) return 0;
        int length= Math.min(s1.length(), s2.length());
        for(int i=0;i<length;i++)
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        return s1.length()-s2.length();
    }

    public static boolean comp(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        return true;
    }


}