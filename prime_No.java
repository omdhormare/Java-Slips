import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int cnt=0,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            cnt++;
        }
        if(cnt==2)
        System.out.print("Prime Number....");
        else
        System.out.print("Not Prime Number....");
    }
}