import java.util.*;
class palindrom
{
public static void main(String argc[])
{
   String s;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter String : ");
   s=sc.next();

   StringBuffer s1=new StringBuffer(s);
   s1.reverse();
   if(s.equals(s1.toString()))
   System.out.print("Palindrom String ...");
   else
   System.out.print("NOT Palindrom String ...");
}
}