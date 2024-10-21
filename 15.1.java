import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        int i,n,cnt=0;
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        n=sc.nextInt();

        String a[] = new String[n];

        System.out.print("\nEnter Names :\n");
        for(i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        System.out.print("\nDisplay Names :\n");
        for(i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.print("\nEnter Name To Search : ");
        s1=sc.next();
        for(i=0;i<n;i++)
        {
            if(a[i].equals(s1))
            {
                cnt++;
            }
        }
        if(cnt>0)
           System.out.print("Name Found : "+i);
        else
          System.out.print("Name Not Found : ");
    }
}