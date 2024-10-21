import java.util.*;
class demo
{
    public static void main(String[] args) 
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String Limit : ");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.print("Enter String : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.print("String Reverce Format : ");
        for(i=n;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}