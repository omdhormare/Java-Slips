import java.util.*;
class demo
{
    public static void main(String[] argc) 
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        a=Integer.parseInt(argc[0]);
        b=Integer.parseInt(argc[1]);
        do
        {
          System.out.print("\n1.Addtion "+"2.Substraction "+"3.Multiplication"+"4.Division\n");
          System.out.print("\nEnter Choice : ");
          ch=sc.nextInt();
          switch(ch)
          {
            case 1: System.out.print("\nAddtion : "+(a+b));
                    break;
            case 2: System.out.print("\nSubstraction : "+(a-b));
                    break;
            case 3: System.out.print("\nMultiplication : "+(a*b));
                    break;
            case 4: System.out.print("\nDivison : "+(a/b));
                    break;
          }
        }while(ch<6);
    }
}