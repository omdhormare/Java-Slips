/*A) Write a java program to display each String in reverse order from a String array */
import java.util.*;
class ReverseStrings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();
        sc.nextLine();
        
        String[] s = new String[limit];
        
        System.out.println("Enter Strings: ");
        for (int i = 0; i < limit; i++) 
        {
            s[i] = sc.nextLine();
        }
        
        System.out.println("\nReversed Strings: ");
        for (int i = 0; i < limit; i++) 
        {
            StringBuilder sb = new StringBuilder(s[i]);
            System.out.println(sb.reverse().toString());
        }
    }
}
