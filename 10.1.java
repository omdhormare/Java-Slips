import java.util.*;
class demo
{
    public static void main(String[] args) 
    {
        String s;
        char ch;
        int i,cnt;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        s=sc.next();
        for(ch='a';ch<='z';ch++)
        {
            cnt=0;
            for(i=0;i<s.length();i++)
            {
               if(ch==s.charAt(i))
               {
                 cnt++;
               }
            }
            if(cnt!=0)
              System.out.print("\n"+ch+":"+cnt);
        }
    }
}