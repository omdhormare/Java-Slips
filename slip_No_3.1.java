/* Write a ‘java’ program to check whether given number is Armstrong or not.
 (Use static keyword) */
 import java.util.*;
class Armstrong
{
    static void Armstrong(int n)
    {
        int n1=n,sum=0,d;
        while(n>0)
        {
            d=n%10;
            sum=sum+d*d*d;
            n=n/10;
        }
        if(n1==sum)
        System.out.print("Armstrong Number...");
        else
        System.out.print("Not Armstrong Number...");
    }
    public static void main(String argc[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number : ");
      int n=sc.nextInt();
       Armstrong.Armstrong(n);
   }   

}
