/*B) Define an abstract class Shape with abstract methods area () and volume ().
 Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program 
 to calculate area and volume of Cone and Cylinder.(Use Super Keyword.) */
import java.util.*;
abstract class shape
{
    float PI=3.14f;
    Scanner sc=new Scanner(System.in);
    abstract void area();
    abstract void volume();
}
class cone extends shape
{
       float r,h;
    void accept()
    {
        System.out.print("Enter Radius Of Cone : ");
        r=sc.nextFloat();
        System.out.print("Enter Height Of Cone : ");
        h=sc.nextFloat();
    }
    void area()
    {
        float cal;
        cal=(2*super.PI*r*r) + (2*super.PI*r*r);
        System.out.println("Area of Cone : "+cal);
    }
    void volume()
    {
        float cal;
        cal=super.PI*r*r*h;
        System.out.print("Volume of Cone : "+cal);
    }
}

class cylinder extends shape
{
    float r,h;
    void Accept()
    {
       System.out.println("\nEnter Cyliner Radius : ");
       r=sc.nextFloat();
       System.out.println("Enter Cyliner Height : ");
       h=sc.nextFloat();
    }
    void area()
    {
        double res;
        res=2*super.PI*r+(r+h);
        System.out.println("Area of Cylinder : "+res);
    }
    void volume()
    {
        float cal;
        cal=super.PI*r*r*h;
        System.out.println("Volume Of Cylinder : "+cal);
    }
}

class test
{
    public static void main(String[] args) 
    {
        cone ob=new cone();
        cylinder ob1 = new cylinder();
        ob.accept();
        ob.area();
        ob.volume();

        ob1.Accept();
        ob1.area();
        ob1.volume();
    }
}