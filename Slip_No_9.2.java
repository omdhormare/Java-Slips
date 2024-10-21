/*B) Write a java program to validate PAN number and Mobile Number. If it is invalid 
then throw user defined Exception Invalid Data, otherwise display it. */
import java.util.*;
class demo
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        String mno,panno;
        try
        {
          System.out.print("Enter Phone Number : ");
          mno=sc.nextLine();
          if(mno.matches("[0-9]{10}"))
             System.out.print("Valid Phone Number ..");
          else
            System.out.print("InValid Phone Number ..");

          System.out.print("\nEnter Pan Number : ");
          panno=sc.nextLine();
          if(panno.matches("[A-Z]{5}[0-9]{4}[A-Z]"))
             System.out.print("Valid Pan Number ..");
          else
            System.out.print("InValid Pan Number ..");

        }catch(Exception e)
        {
            System.out.print("Invalid input..");
        }
    }
}