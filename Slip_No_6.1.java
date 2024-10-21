/*A) Write a java program to accept a number from user, if it zero then throw user 
defined Exception Number Is Zero , otherwise calculate the sum of first and last digit 
of that number. (Use static keyword) */
import java.util.*;
class demo
{
    static int n;
    public static void main(String[] args) 
    {
        int f,l;
        try
        {
           System.out.print("Enter Number : ");
           Scanner sc=new Scanner(System.in);
           n=sc.nextInt();

           l=n%10;
           f=n;
           while(f>=10)
           {
             f=f/10;
           }
           System.out.print("\nFirst Number : "+f);
           System.out.print("\nLast Number : "+l);
           System.out.print("\nFirst & Last Digit Sum : "+(f+l));
        }
        catch(Exception e)
        {
          if(n==0)
           System.out.print("Number Is Zero..");
        }
    }
}