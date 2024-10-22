import java.util.*;
interface Number
{
    void cube(int n);
    void squre(int n);
}
class opration implements Number
{
    public void cube(int n)
    {
        System.out.println("Cube of Number : "+n*n*n);
    }
    public void squre(int n)
    {
        System.out.print("Square of Number : "+n*n);
    }
    public static void main(String a[])
    {
        opration ob=new opration();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        ob.cube(n);
        ob.squre(n);
    }
}
