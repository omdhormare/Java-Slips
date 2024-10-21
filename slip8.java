import java.util.*; 
interface Shape
{
    final float PI=3.14f;
    Scanner sc=new Scanner(System.in);
    void area();
}
class circle implements Shape
{
    float r;
    public void area()
    {
        System.out.print("Enter Area of Circle : ");
        r=sc.nextFloat();
        System.out.print("Area Of Circle : "+(PI*r*r));
    }
}
class sphere implements Shape
{
    float r;
    public void area()
    {
        System.out.print("Enter Area of Sphere : ");
        r=sc.nextFloat();
        System.out.print("Area Of Sphere : "+(PI*4*r*r));
    }
}
class demo
{
    public static void main(String argc[])
    {
        circle ob=new circle();
        sphere ob1=new sphere();
        ob.area();
        ob1.area();
    }
}