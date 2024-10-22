//Use Abstract Methods and writr a program to calculate Arithmatic opration
import java.util.*;
public abstract class o1
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    abstract void Accept();
    abstract  void add();
    abstract  void sub();
    abstract  void mul();
}
public class Accept extends o1
{
    Accept()
    {
        System.out.print("Enter 1 Number : ");
        super.a=sc.nextInt();
        System.out.print("Enter 2 Number : ");
        super.b=sc.nextInt(); 
    }
}
public class Addition extends o1
{
    public void add()
    {
        System.out.print("Addtion : "+(super.a + super.b));
    }
}
public class subsrcation extends o1
{
    public void sub()
    {
        System.out.println("Substraction : "+(super.a - super.b));
    }
}
public class multiplication extends o1
{
    public void mul()
    {
        System.out.println("Substraction : "+(super.a * super.b));
    }
}
public class demo
{
    public static void main(String argc[])
    {
        Accept ob=new Accept();
        subsrcation ob2 =new subsrcation();
        multiplication ob3 =new multiplication();
    }
}
