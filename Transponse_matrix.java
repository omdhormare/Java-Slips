import java.util.*;
class matrix
{
    public static void main(String argc[])
    {
        int a[][],i,n1,n,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Matrix Rows Element : ");
        n=sc.nextInt();

        System.out.print("Enter Matrix Colume Element : ");
        n1=sc.nextInt();

        a=new int[n][n1];

        System.out.print("Matrix Element : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display Matrix Element...");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n1;j++)
            {
                System.out.print("\t" +a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Display Transponse Matrix....");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("\t"+a[j][i]);
            }
            System.out.print("\n");
        }
    }
}