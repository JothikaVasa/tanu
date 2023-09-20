import java.util.*;
public class arrtwo{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int rsize=sc.nextInt();
         int csize=sc.nextInt();
         int[][] arr= new int[rsize] [csize];
         System.out.println("Enter elements:");
         for(int i=0;i<rsize;i++)
           {
              for(int j=0; j<csize;j++)
               { 
                   arr[i][j]= sc.nextInt();
          for(int i=0;i<rsize;i++)
           {
              for(int j=0; j<csize;j++)
               {
                System.out.println(arr[i][j]+" " );
                }
                 System.out.println(" ");
           }
}
}