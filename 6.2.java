import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int i,j;
        System.out.print("\nEnter Matrix Elements : \n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nDisplay Matrix Elemets\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\nDisplay Transpose Elemets\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        
    }
}