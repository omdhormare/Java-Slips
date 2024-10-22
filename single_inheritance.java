import java.util.*;
class Number
{
    Number()
    {
    int i,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number : ");
    n=sc.nextInt();
    }
}
class sum_of_digit extends Number
{
    sum_of_digit()
   { 
   while(n>0)
   {
      d=n%10;
      sum=sum+d;
      n=n/10;
   }
   System.out.print("Sum Of Digit : "+sum);
   void static void main(String args[])
   {
       sum_of_digit ob=new sum_of_digit();
   }
}
}