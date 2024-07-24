/*Write a java program to display all the vowels from a given string
Vowels a,e,i,o,u
*/
import java.lang.*;
import java.util.*;
class vowels
{
    public static void main(String argc[])
  {  
    String s1;
    int i;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter String : ");
    s1=sc.nextLine();
    System.out.print("Vowels : ");
    
    for(i=0;i<s1.length();i++)
    {
        if(s1.charAt(i)=='A'||s1.charAt(i)=='a'||s1.charAt(i)=='E'||
           s1.charAt(i)=='e'||s1.charAt(i)=='I'||s1.charAt(i)=='i'||
           s1.charAt(i)=='O'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||
           s1.charAt(i)=='U')

           System.out.print(" "+s1.charAt(i));
        
    }
}
}