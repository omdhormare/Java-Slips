import java.util.*;
abstract class shape
{
   Scanner sc=new Scanner(System.in);
   float PI=3.14f;
   abstract void area();
   abstract void volume();
}
class cone extends shape
{
     float r,h,res;
    void Accept()
    {
        System.out.print("Enter Radius of Cone : ");
        r=sc.nextFloat();
        System.out.print("Enter Hight of Cone : ");
        h=sc.nextInt();
    }
    public void area()
    {
        float cal;
        cal=super.PI * r*r+super.PI*r*r;
        System.out.print("Area Of Cone : "+cal);
    }
    public void volume()
    {
        float cal;
        cal=super.PI*r*r*h;
       System.out.print("Volume Of Cone : "+cal);
    }
}
class cylinder extends shape
{
    float r,h,res;
    void AcceptC()
    {
        System.out.print("Enter Radius of Cylinder : ");
        r=sc.nextFloat();
        System.out.print("Enter Hight of Cylinder : ");
        h=sc.nextInt();
    }
    public void area()
    {
        float cal;
        cal=super.PI * (r+h)*super.PI;
        System.out.print("Area Of Cylinder : "+cal);
    }
    public void volume()
    {
        float cal;
        cal=super.PI*r*h*h;
       System.out.print("Volume Of Cylinder : "+cal);
    }
    public static void main(String[] args) 
    {
        cylinder ob=new cylinder();
        cone ob1=new cone();
        ob.AcceptC();
        ob.area();
        ob.volume();

        ob1.Accept();
        ob1.area();
        ob1.volume();
    }
}