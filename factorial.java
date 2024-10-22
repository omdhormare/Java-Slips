import java.util.Scanner;
class fact
{
            public static void main(String[] argc)
             {
                     int i,f=1,n;
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Enter Number : ");
                    n=sc.nextInt();
                    sc.close();
                    for(i=1;i<=n;i++)
                   {
                            f=f*i;
                  }
                  System.out.print("Factorial No : "+f);
            }     
}