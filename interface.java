import java.util.*;
interface AA
{
    void Addition(int a,int b);
    void sub(int a,int b);
}
class Add implements AA
{
    public void Addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Addtion : "+c);
    }
    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.print("Substraction : "+c);
    }
}
class BB
{
    public static void main(String argc[])
    {
        int a,b;
        Add ob=new Add();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 Number : ");
        a=sc.nextInt();
        System.out.print("Enter 2 Number : ");
        b=sc.nextInt();
        ob.Addition(a,b);
        ob.sub(a,b);
    }
}