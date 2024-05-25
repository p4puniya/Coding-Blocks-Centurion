class interview{
    public static void main(String arg[]){
        //Hello World
        //olleH dlrow
        String s= "Hello World";
        int i=0;
        while(i<s.length()){
            String word="";
            while(i<s.length() && s.charAt(i)!=" "){
                word+=s.charAt(i);
                i++;
            }
            print(word);
            i++;
        }
    }

    public static void print(String s){
        for(int i=s.length()-1;i>=0;i++)
            System.out.print(s.charAt(i));
        System.out.print(" ");
    }
}