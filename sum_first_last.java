import java.util.*;
class sum
{
    public static void main(String argc[])
    {
        int n,sum,l;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No : ");
        n=sc.nextInt();

        l=n%10;
        while(n>9)
        {
            n=n/10;
        }
        sum=l+n;
        System.out.print("Fist ANd Last Digit Sum : "+sum);
    }
}