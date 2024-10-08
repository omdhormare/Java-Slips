/*Write a java program to search given name into the array, if it is found then display 
its index otherwise display appropriate message. */
import java.util.*;
class search
{
   public static void main(String[] args) 
   {
      int i,n,cnt=0;
      String n1;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Limit : ");
      n=sc.nextInt();

      String a[] = new String[n];

      System.out.print("Enter Name : ");
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextLine();
      }

      System.out.print("\nDisplay Array Name : ");
      for(i=0;i<n;i++)
      {
        System.out.print(" " + a[i]);
      }

      System.out.print("\nEnter Name To Search : ");
      n1=sc.nextLine();

      for(i=0;i<n;i++)
      {
        if(a[i].equals(n1))
        {
            cnt++;
        }
      }
      if(cnt>0)
        System.out.print("\nName Found..."+i);
     else
        System.out.print("Name Not Fount...");
   }
}