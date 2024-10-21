/*A) Write a java program to accept ‘n’ integers from the user & store them in an 
ArrayList collection. Display the elements of ArrayList collection in reverse order. */
import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        int i,n1,n;
        Scanner sc=new Scanner(System.in);
        ArrayList A=new ArrayList();
        System.out.print("Enter Limit : ");
        n=sc.nextInt();

        System.out.print("Enter Array List Elemet : ");
        for(i=0;i<n;i++)
        {
            n1=sc.nextInt();
            A.add(n1);
        }
        System.out.print("Array List Element : "+A);

        Collections.reverse(A);
        System.out.print("\nReverse Array List Elements : "+A);
    }
}