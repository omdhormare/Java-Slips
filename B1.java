//A) Write a java program to display all the vowels from a given string.
import java.util.*;
//import java.lang.*;
class vowels
{
    public static void main(String argc[])
    {
        String s1;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter String : ");
       s1=sc.next();
       for(int i=0;i<s1.length();i++)
       {
         if(s1.charAt(i)=='A' || s1.charAt(i)=='a' || s1.charAt(i)=='E' ||
            s1.charAt(i)=='e' || s1.charAt(i)=='I' || s1.charAt(i)=='i' ||
            s1.charAt(i)=='O' || s1.charAt(i)=='o' || s1.charAt(i)=='U' ||
            s1.charAt(i)=='u')

         System.out.print(s1.charAt(i));
       } 
    }
}