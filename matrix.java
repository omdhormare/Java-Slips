import java.util.*;

class matrix {
     public static void main(String[] args) {
          int i, j, n, n1;
          int a[][] = new int[n][n1];
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter  rows Limit : ");
          for (i = 0; i < n; i++) {
               for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
               }
          }
          System.out.print("\n Display Matrix Element : \n");
          for (i = 0; i < n1; i++) {
               for (j = 0; j < n1; j++) {
                    System.out.print("\t" + a[i][j]);
               }
               System.out.print("\n");
          }
     }
}
