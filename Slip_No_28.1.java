/*Write a java program to count the number of integers from a given list. (Use Command line 
arguments). */
import java.util.*;
class count1
{
    public static void main(String argc[])
    {
        int cnt=0;
        cnt=argc.length;
        cnt++;
        System.out.println("Total Integer Number count : "+(cnt-1));
    }
}