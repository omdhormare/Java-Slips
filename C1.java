//A) Write a java program to display alternate character from a given string
import java.util.*;
class alternate
{
    public static void main(String argc[])
    {
       Scanner sc=new Scanner(System.in);
       String s1;
       System.out.print("Enter String : ");
       s1=sc.next();

       for(int i=0;i<s1.length();i=i+2)
       {
         System.out.print(s1.charAt(i));
       }
    }
}