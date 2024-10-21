import java.util.*;
class demo
{
    static int n;
    public static void main(String argc[])
    {
        try
        {
            int l,f;
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter Number : ");
           n=sc.nextInt();
           if(n==0)
             System.out.print("Number Is Zero...");
           else
            {
                l=n%10;
                f=n;
                while(f>=10)
                {
                    f=f/10;
                }
                System.out.print("\nFirst Number : "+f);
                System.out.print("\nLast Number : "+l);
                System.out.print("\nSum Number : "+(f+l));
                
            }

        }catch(Exception e)
        {
            System.out.print("Invalid input...");
        }
    }
}