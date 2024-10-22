import java.util.*;
class Array
{
    public static void main(String s[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
       
        System.out.print("Enter Limit : ");
        n=sc.nextInt();
       
        System.out.print("Enter Number : ");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        System.out.print("\nNumber Display : \n");
        for(i=0;i<n;i++)
        System.out.print("\t"+a[i]);

        System.out.print("\nReverse Number :\n");
        for(i=n-1;i>=0;i--)
         {
            System.err.print("\t"+a[i]);
         }
        
    }
}