import java.util.*;
class AAA
{
    void Arithmatic(int a,int b)
    {
        System.out.print("Addtion : "+(a+b));
    }
    void Arithmatic(int a,long b)
    {
        System.out.print("Substraction : "+(a-b));
    }
    void Arithmatic(int a,byte b)
    {
        System.out.print("Multiplication : "+(a*b));
    }
    void Arithmatic(int a,float b)
    {
        System.out.print("Division : "+(a/b));
    }
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        AAA ob=new AAA();
        int a,b;
        System.out.print("Enter 1 Number : ");
        a=sc.nextInt();

        System.out.print("Enter 2 Number : ");
        b=sc.nextInt();
        
        ob.Arithmatic(a, b);
        ob.Arithmatic(a, (long)b);
        ob.Arithmatic(a, (byte)b);
        ob.Arithmatic(a, (float)b);
    }
}

