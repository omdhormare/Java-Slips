import java.util.*;
class Array1
{
    public static void main(String argc[])
    {
        int i,n,a[];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Limit : ");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("Enter Array Element : ");
        for(i=0;i<n;i++)

        a[i]=sc.nextInt(); 

       System.out.println("Display Array Element : ");
        for(i=0;i<n;i++)
         System.out.print(" "+a[i]);
    }
}