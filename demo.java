import addition.*;
import java.util.*;
public class demo
{
    public static void main(String argc[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 No : ");
        a=sc.nextInt();
        System.out.print("Enter 2 No : ");
        b=sc.nextInt();

        addition ob=new addition();
        ob.addition(a,b);
    }
}