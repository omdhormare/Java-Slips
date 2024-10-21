/*Write a java program to count the frequency of each character in a given string. */
import java.util.*;
class Frequency 
{
    public static void main(String[] args) 
    {
        String s1;
        char ch;
        int cnt;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        s1 = sc.nextLine();
        //s1 = s1.toLowerCase(); 

        for (ch = 'a'; ch <= 'z'; ch++) 
        {
            cnt = 0;
            for (int i = 0; i < s1.length(); i++) 
            {
                if (ch == s1.charAt(i)) 
                {
                    cnt++;
                }
            }
            if (cnt != 0) 
                System.out.println(ch + "\t" + cnt);
        }
    }
}
