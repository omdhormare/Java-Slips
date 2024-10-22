import java.util.*;
class A
{
    public static void main(String argc[])
    {
        int i,n,ch,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 Number : ");
        a=sc.nextInt();
        System.out.print("Enter 2 Number : ");
        b=sc.nextInt();
        
        do
        {
            System.out.println("-------------------------------------------------");
            System.out.println("1)....Addtion....");
            System.out.println("2)....Substraction....");
            System.out.println("3)....Multiplication....");
            System.out.println("4)....Division....");
            
            System.out.println("-----------------------------------------------------");
            System.out.print("Enter Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: 
                       System.out.println("Addtion : "+(a+b));
                       break;
                case 2:
                       System.out.println("Subtracion : "+(a-b));
                       break;   
                case 3:
                       System.out.println("Multiplication : "+(a*b));
                       break;
                case 4:
                       System.out.println("Division : "+(a/b));
                       break;      
                case 5:
                       default:
                       System.out.println("Invalid Choice....");                   
            }
        }while(ch<6);
    }
}