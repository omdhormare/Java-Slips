//A) Write a java program to display all the vowels from a given string
import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        String s;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        s=sc.nextLine();
        System.out.print("Total Vowel : ");
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='E' ||
               s.charAt(i)=='i' ||s.charAt(i)=='I' ||s.charAt(i)=='o' ||s.charAt(i)=='O' ||
               s.charAt(i)=='U' || s.charAt(i)=='u' )

            System.out.print(s.charAt(i));
        }
    }
}