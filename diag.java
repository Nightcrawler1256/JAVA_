import java.util.Scanner;
public class diag {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Diagonal program");
        System.out.println("enter the number of line ");
         int n=scan.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(i==j){
                     System.out.print("*");
                 }
                 else {
                     System.out.print(" ");
                 }
             }
                 System.out.println();
         }

    }
}
