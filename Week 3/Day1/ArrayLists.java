import java.util.*;
class ArrayLists{
    public static void main(String[] args){
        //1. Syntax
        // ArrayList<Integer> arr= new ArrayList<>();
        // // Add an element
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(50);
        // arr.add(60);
        // arr.add(3,40);
        // // Access an Element
        // arr.get(1);//where 1 is an index
        // // Remove an Element
        // arr.remove(1);
        // // Update
        // //arr[0]+=10;
        // arr.set(1,100);
        // arr.set(2,arr.get(2)+10);
        // //size
        // // arr.size();
        // //Sort
        // Collections.sort(arr);
        // // Display our Arraylist
        // System.out.print(arr);
        // 1. Take the size of the arraylist as an input: n
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // 2. Take the elements as an input.
        ArrayList<Integer> arr= new ArrayList<>(n);
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        // 3. Sort the arraylist.
        Collections.sort(arr);
        // 4. Sum of the arrayList.
        int sum=0;
        for(int num: arr)
            sum+=num;

        // 5. Smallest/Largest number in your arraylist.
        System.out.println(arr.get(0)+" "+arr.get(n-1));
        // 6. Average of the whole arraylist. In Double
        System.out.println((double)sum/n);
        // 7. Make another arraylist of type string
        ArrayList<String> s;
        // 8. Take a sentence as an input, 
        //    and store the words in your new arraylist.
        String str= sc.nextLine().trim();
        String[] arrs= str.split("\s+");
        s=new ArrayList<String>(Arrays.asList(arrs));
        // 9. Print the index of words that are a pallindrome
        // 10.Print the String in a reverse order via Arraylist.
        Collections.reverse(s);
        String ans= String.join(" ",s).trim();
        System.out.println(ans);
    }
}