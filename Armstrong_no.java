import java.util.*;
class Check {
    public static void main(String[] args) 
    {
        int sum, n, d; 
        for (int i = 1; i < 1000; i++) 
        {
            sum = 0; // Reset sum for each number
            n = i;   // Assign the current number to n
            
            while (n > 0) 
            {
                d = n % 10;            // Get the last digit
                sum += d * d * d;       // Add the cube of the digit to sum
                n /= 10;                // Remove the last digit
            }   
            if (sum == i)     // Check if the sum of cubes is equal to the original number
              System.out.println("Armstrong Number: " + i);
        }
    }
}
