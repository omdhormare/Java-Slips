import java.util.*;

class sum_digit {
       public static void main(String[] args) {
              int n, sum = 0, d;
              Scanner s = new Scanner(System.in);
              System.out.println("Enter Number : ");
              n = s.nextInt();
              while (n > 0) {
                     d = n % 10;
                     sum = sum + d;
                     n = n / 10;
              }
              System.out.println("Sum Of Digit : " + sum);
              s.close();
       }
}