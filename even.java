import java.util.*;
public class even
{
   public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int a= sc.nextInt();
    int b= sc.nextInt();
    for(int i=a;a<=b;a++){
    if( a % 2==0)
          {
              System.out.println("even numbers are:"+a);
          }      
      }
    }
}
    