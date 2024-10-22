import java.util.*;
class Perfect
{
    public static  void main(String argc[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        System.out.print("Perfect Number......");
        else
        System.out.print("Not Perfect Number......");

    }
}