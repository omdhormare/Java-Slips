import java.util.*;
class demo
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n,n1,i;
      ArrayList AA=new ArrayList();
      System.out.print("Enter Array List Limit : ");
      n=sc.nextInt();

      System.out.print("\nEnter Array List Elements : \n");
      for(i=0;i<n;i++)
      {
         n1=sc.nextInt();
         AA.add(n1);
      }
      System.out.print("\nDisplay Array List Elements in Reverse Order :\n");
      Collections.reverse(AA);
      System.out.print(AA);
   }
}