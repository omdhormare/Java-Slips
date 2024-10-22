                           /* Multilevel Inheritance */
class Addition
{
    int a=10,b=100,c;
    Addition()
    {
        c=a+b;
        System.out.println("Addtion : "+c);
    }
}
class Substraction extends om
{
    Substraction()
    {
        c=a-b;
        System.out.println("Substraction : "+c);
    }
}
class Multiplication extends Substraction
{
    Multiplication()
    {
        c=a*b;
        System.out.println("Multiplication : "+c);
    }
}
class Multilevel
{
    public static void main(String argc[])
    {
        Multiplication ob=new Multiplication();
    }
}
