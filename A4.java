/*A) Write a ‘java’ program to check whether given number is Armstrong or not.
 (Use static keyword) */
import java.util.*;
class Armstrong
{
    static
    {
        int n,n1,sum=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        n1=n;
        while(n>0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(sum==n1)
            System.out.print("Armstrong Number..");
        else
            System.out.print("Not Armstrong Number..");
    }
    public static void main(String argc[])
    {

    }
}