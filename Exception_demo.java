import java.util.*;
class Demo
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1 Number : ");
        a=sc.nextInt();
        System.out.print("Enter 2 Number : ");
        b=sc.nextInt();
    try
    {
        System.out.print("Addtion : "+(a/b));
    }
    catch(Exception e)
    {
        System.out.print("Exception Name : "+e);
    }
    }
}