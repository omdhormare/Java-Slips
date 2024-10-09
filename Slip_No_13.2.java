/*B) Write a java program that asks the user name, and then greets the user by name. 
Before outputting the user's name, convert it to upper case letters. For example, if 
the user's name is Raj, then the program should respond "Hello, RAJ, nice to meet 
you!". */
import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        String s;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Name : ");
       s=sc.nextLine();

       System.out.print("\nHello ," + s.toUpperCase() + "," + "nice to meet you!");

    }
}