import java.util.*;
class sort{
    public static void main(String argc[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.print("Enter Employee Name : ");
        for(i=0;i<n;i++)
        a[i]=sc.next();

        System.out.print("Display Name : ");
        for(i=0;i<n;i++)
        System.out.print(a[i]);

        Arrays.sort(a);

        System.out.print("Display Name Ascending order: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}