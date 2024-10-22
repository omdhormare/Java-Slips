import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        int i,n,f,l;
        Scanner sc=new Scanner(System.in);
        try
        {
          System.out.print("Enter Number : ");
          n=sc.nextInt();
          if(n==0)
          {
            System.out.print("Number Is Zero..");
          }
        else
          {
            l=n%10;
            f=n;
            while(f>=10)
            {
                f=f/10;
            }
            System.out.print("First No : "+f);
            System.out.print("Last No : "+l);
            System.out.print("First No +Last : "+(f+l));
            
          }
        }catch(Exception e)
        {
           System.out.print("Invalid Number");
        }
    }
}