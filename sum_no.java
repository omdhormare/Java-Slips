import java.util.*;

class sum_no 
{
    public static void main(String[] args) 
    {
        int sum = 0, n;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        n = s.nextInt();
        
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        
        System.out.println("Sum of Numbers: " + sum);
        s.close();
    }
}
