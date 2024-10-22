import java.util.*;
class demo
{
    public static void main(String argc[])
    {
       char ch;
       int i,cnt;
       String s1;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter String : ");
       s1=sc.nextLine();
       for(ch='a';ch<='z';ch++)
       {
          cnt=0;
          for(i=0;i<s1.length();i++)
          {
             if(s1.charAt(i)==ch)
             {
                cnt++;
             }
          }
          if(cnt>0)
            System.out.print("\n"+ch +" : "+cnt);
       }
    }
}