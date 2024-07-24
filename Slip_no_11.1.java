/*Write a menu driven java program using command line arguments for the following: [15 M]
 1. Addition 
 2. Subtraction
 3. Multiplication 
 4. Division.*/
 import java.util.*;
class cla
{
    public static void main(String argc[])
    {
        int ch,a,b;
        Scanner sc=new Scanner(System.in);
        a=Integer.parseInt(argc[0]);
        b=Integer.parseInt(argc[1]);
        
        do{
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.print("Enter Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Addtion : "+(a+b));
                       break;
                case 2:System.out.println("Substraction : "+(a-b));
                       break;  
                case 3:System.out.println("Multiplication : "+(a*b));
                       break;   
                case 4:System.out.println("Division : "+(a/b));
                       break;                          
            }
          }while(ch<6);
    }
}