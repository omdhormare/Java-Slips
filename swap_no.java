import java.util.*;

class swap 
{
   public static void main(String[] args) 
   {
      int a, b;
      Scanner sca = new Scanner(System.in);
      System.out.print("Enter 1 Number  : ");
      a = sca.nextInt();
      System.out.print("Enter 2 Number  : ");
      b = sca.nextInt();
      System.out.println("\nBefore Swap A : " + a);
      System.out.println("Before Swap B : " + b);
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println("\n\nAfter Swap A : " + a);
      System.out.println("After Swap B : " + b);
      sca.close();
   }
}