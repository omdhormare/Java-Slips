import java.util.*;
class Arithmatic
{
      int a,b;
    Scanner s=new Scanner(System.in);
   void Accept()
    {
        System.out.println("Enter 1 Number  : ");
        a=s.nextInt();  
       System.out.println("Enter 2 Number  : ");
        b=s.nextInt();   
   }
     void Addtion()
    {
        System.out.println("Addtion : "+(a+b));
   }
   void sub()
    {
        System.out.println("Substrction : "+(a-b));
   }
   void Mult()
    {
        System.out.println("Multiplication : "+a*b);
   }
  void div()
    {
        System.out.println("Division : "+a/b);
   }
public static void main(String[] argc)
{
        Arithmatic ob=new Arithmatic();
        ob.Accept();
        ob.Addtion();
        ob.sub();
       ob.Mult();
       ob.div();
}
}


