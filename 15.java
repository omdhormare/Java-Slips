import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,cnt=0;
        String s1;
        System.out.print("Enter Limit : ");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.print("\nEnter Names \n");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.print("\nDisplay Names\n");
        for(i=0;i<n;i++)
        {
            System.out.print(""+a[i]);
        }
        System.out.print("Enter Name To search : ");
        s1=sc.nextLine();
        for(i=0;i<n;i++)
        {
            if(a[i].equals(s1))
            {
                cnt++;
            }
        }
        if(cnt>0)
          System.out.print("Found");
        else
        System.out.print("Not Found");
    }
}