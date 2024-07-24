/*Write a java program to display alternate character from a given string. */
import java.util.*;
class character
{
    public static void main(String argc[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        s=sc.nextLine();
        System.out.print("Alternate charater :");
        for(int i=0;i<s.length();i=i+2)
        {
            System.out.print(s.charAt(i));
        }
    }
}