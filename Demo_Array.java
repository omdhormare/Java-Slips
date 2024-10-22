import java.util.*;
class Array
{
   public static void main(String argc[])
   {
      Scanner sc=new Scanner(System.in);
      int a[],i,n,n1;
      System.out.print("Enter Array Limit : ");
      n=sc.nextInt();

      a=new int[n];

      System.out.print("Enter Array Element : ");
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.print("Display Array Element : ");
      for(i=0;i<n;i++)
      {
        System.out.print(" "+a[i]);
      }
      
   }
}