import java.util.*;

class Star {
       public static void main(String[] a) {
              int i, j, n;
              Scanner s = new Scanner(System.in);
              System.out.print("Enter Number : ");
              n = s.nextInt();
              for (i = 1; i <= n; i++) {
                     for (j = 1; j <= i; j++) {
                            System.out.print(" * ");
                     }
                     System.out.print("\n");
              }

       }
}