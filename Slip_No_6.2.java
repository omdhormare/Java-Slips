/*B) Write a java program to display transpose of a given matrix.  */
import java.util.*;
class matrix
{
  public static void main(String[] args) 
  {
     int i,j;
     Scanner sc=new Scanner(System.in);
     int a[][] = new int[2][2];
     System.out.print("Matrix Element : ");
     for(i=0;i<2;i++)
     {
        for(j=0;j<2;j++)
        {
           a[i][j]=sc.nextInt();
        }
     }
     System.out.print("\n Display Matrix Element \n");
     for(i=0;i<2;i++)
     {
        for(j=0;j<2;j++)
        {
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
     }
     System.out.print("\n Display Transpose Matrix \n");
     for(i=0;i<2;i++)
     {
        for(j=0;j<2;j++)
        {
            System.out.print(a[j][i]+"\t");
        }
        System.out.println();
     }
  }
}