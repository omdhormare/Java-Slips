import java.util.*;
class rev
{
       public static void main(String[] args)
       {
           int d,n;
           Scanner s=new Scanner(System.in);
          System.out.print("Enter Number : ");
          n=s.nextInt();
             System.out.print("Reverse No : ");
          while(n>0)     
            {
                   d=n%10;
                   System.out.print(d);
                  n=n/10;
            }
            s.close();
       }
}