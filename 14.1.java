import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        int p,n,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();

        System.out.print("Enter Number Power: ");
        p=sc.nextInt();  

        res=power(n,p);
        System.out.print("Power Number : "+res);
    }
    static int power(int n,int p)
    {
        if(p==0)
         return 1;
        else 
          return n*power(n,p-1);
    }
}