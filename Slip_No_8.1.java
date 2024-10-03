/*A) Define an Interface Shape with abstract method area(). Write a java program to 
calculate an area of Circle and Sphere.(use final keyword) */
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
       System.out.print("Enter Radius Of Circle : ");
       r=sc.nextFloat();
       System.out.print("\n Area Of Circle : "+(PI * r*r));
    }
}
class Sphere implements Shape
{
    float r;
    public void area()
    {
       System.out.print("\nEnter Radius Of Sphere : ");
       r=sc.nextFloat();
       System.out.print("\nArea Of Sphere : "+(PI *4* r*r));
    }
}
class test
{
    public static void main(String[] args) 
    {
        circle ob=new circle();
        Sphere ob1=new Sphere();
        ob.area();
        ob1.area();
    }
}