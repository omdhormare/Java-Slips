import java.util.*;
class player
{
    int pid,notout,inning,totalrun,batavg;
    String name;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
       System.out.print("\nEnter Player id : ");
       pid=sc.nextInt();
       System.out.print("\nEnter Player Name : ");
       name=sc.next();
       System.out.print("\nEnter Player Total Run : ");
       totalrun=sc.nextInt();
       System.out.print("\nEnter Player Inning : ");
       inning=sc.nextInt();
       System.out.print("\nEnter Player Not Out : ");
       notout=sc.nextInt();
       batavg=totalrun/(inning-notout);
    }
    void dis()
    {
        System.out.print("\nPlayer Id : "+pid);
        System.out.print("\nPlayer Name : "+name);
        System.out.print("\nPlayer Total Run : "+totalrun);
        System.out.print("\nPlayer Inning : "+inning);
        System.out.print("\nPlayer NotOut : "+notout);
        System.out.print("\nBat Avg : "+batavg);
    }
    public static void main(String[] args) 
    {
        int i,n,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player Limit : ");
        n=sc.nextInt();
        player ob[]=new player[n];
        for(i=0;i<n;i++)
        {
            ob[i]=new player();
            ob[i].accept();
        }
        for(i=0;i<n;i++)
        {
            ob[i].dis();
        }
        System.out.print("\nMaximum Player\n");
        for(i=0;i<n;i++)
        {
            if(ob[i].batavg>max)
            {
                ob[i].dis();
            }
        }
    }
}