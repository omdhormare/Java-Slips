import java.util.*;
abstract class Arithmatic
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    abstract void add();
}
class demo extends Arithmatic
{
    void add()
    {
        System.out.println("Enter 1 Number : ");
        super.a=sc.nextInt();
        System.out.println("Enter 2 Number : ");
        super.b=sc.nextInt();

        System.out.print("Addtion : "+(super.a+super.b));
    }
}
class test
{
    public static void main(String[] args) 
    {
        demo ob=new demo();
        ob.add();
    }
}