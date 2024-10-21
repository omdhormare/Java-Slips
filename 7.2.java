/*Write a java program to accept details of n cricket player (pid, pname, totalRuns, 
InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the 
details of player having maximum average. (Use Array of Object)*/
import java.util.*;
class player
{
    int pid,totalrun,inningsplayes,notout,avg;
    String name;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
       System.out.print("\nEnter Player Id : ");
       pid=sc.nextInt();
       System.out.print("Enter Player Name: ");
       name=sc.next();
       System.out.print("Enter Player Total Run : ");
       totalrun=sc.nextInt();
       System.out.print("Enter Player inningsplayes: ");
       inningsplayes=sc.nextInt();
       System.out.print("Enter Player Notout : ");
       notout=sc.nextInt();
       
       avg=totalrun/(inningsplayes - notout);
    }
    void dis()
    {
        System.out.print("\nPlayer Id : "+pid);
        System.out.print("\nPlayer Name : "+name);
        System.out.print("\nPlayer Total Run : "+totalrun);
        System.out.print("\nPlayer inningsplayes : "+inningsplayes);
        System.out.print("\nBat Avarage : "+avg);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max;
        System.out.print("Enter Limit : ");
        n=sc.nextInt();

        player ob[]=new player[n];

        for(i=0;i<n;i++)
        {
            ob[i]=new player();
            ob[i].accept();
            ob[i].dis();
        }
        int avg=ob[0].avg;
        int index;
        for(i=0;i<n;i++)
        {
            max=ob[i].avg;
            index=i;
        }
        ob[index].dis();
    }
}