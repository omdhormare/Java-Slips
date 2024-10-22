import java.util.*;
class Demo
{
    int i,j,d;
    void factorial(int n)
    {
        int f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial Number : "+f);
    }
    void perfect(int n)
    {
        int sum=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        System.out.println("Perfect Number.......");
        else
        System.out.println("NOT Perfect Number......."); 
    }
    void prime(int n)
    {
        int sum=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            sum++;
        }
        if(sum==2)
         System.out.println("Prime Number....");
        else
         System.out.println("Not Prime Number...."); 
    }
    void Armstrong(int n)
    {
        int n1=n,sum=0;;
        while(n>0)
        {
            d=n%10;
            sum=sum+d*d*d;
            n=n/10;
        }
        if(sum==n1)
        System.out.println("Armstrong Number....");
        else
        System.out.println("NOT Armstrong Number....");        
    }
    void sum_of_digit(int n)
    {
        int sum=0;;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.print("Sum Of Digit : "+sum);      
    }
    
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
       int n;
       System.out.print("Enter Number : ");
       n=sc.nextInt();
       Demo ob=new Demo();
       ob.factorial(n);
       ob.perfect(n);
       ob.prime(n);
       ob.Armstrong(n);
       ob.sum_of_digit(n);
    }
}