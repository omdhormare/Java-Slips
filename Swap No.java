import java.util.*;

class swap {
        public static void main(String[] args) {
                int a, b;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter 1 Number  : ");
                a = s.nextInt();
                System.out.print("Enter 2 Number  : ");
                b = s.nextInt();
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
                System.out.print("After Swap A : " + a);
                System.out.print("After Swap B : " + b);
                s.close();
        }

}