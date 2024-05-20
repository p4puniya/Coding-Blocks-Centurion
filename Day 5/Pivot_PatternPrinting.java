import java.util.Scanner;

public class Pivot_PatternPrinting {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        
        // int n=sc.nextInt();
        ques1(5);
    }

    static void ques1(int n){
        for(int i=1; i<=n;i++){
            for(int k=1; k<=(n-i);k++)System.out.print("  ");
            for(int j=i; j<=2*i-1;j++)System.out.print(j+" ");
            for(int j=2*i-2; j>=i;j--)System.out.print(j+" ");
            System.out.println();
        }
    }

    static void printArrow(int n){
        //figure 1
        for(int i=n;i>=1;i--){
            for(int k=1; k<=2*(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
//Second Figure
        for(int i=2;i<=n;i++){
            for(int k=1; k<=2*(n-i); k++)
                System.out.print("  ");
            for(int j=1; j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }


    static void printK(int n){
        // Code to print star pattern
        //first figure
        for(int i=n; i>=1;i--){
            for(int k=1; k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        //second figure
        for(int i=2; i<=n;i++){
            for(int k=1; k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
