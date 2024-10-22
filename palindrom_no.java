import java.util.*;

class palindrom {
  public static void main(String[] argc) {
    int n, sum = 0, n1, d;
  Scanner s = new Scanner(System.in);
    System.out.print("Enter Number : ");
    n = s.nextInt();
    n1 = n;
    while (n > 0)  {
      d = n % 10;
      sum = sum * 10 + d;
      n = n / 10;
    }
    if (sum == n1)
      System.out.print("Palindrom Number....");
    else
      System.out.print("Not Palindrom......");
    s.close();
  }
}