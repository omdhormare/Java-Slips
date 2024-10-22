import java.util.*;
interface Operation
{
    void area(float r,float h);
    void volume(float r,float h);
}
class Cylinder implements Operation
{
    final float PI=3.14f;
    public void area(float r,float h)
    {
        float a=2*PI*r*(h+r);
        System.out.println("Area of Cylinder : "+a);
    }
    public void volume(float r,float h)
    {
        float a= PI * r * r * h;
        System.out.print("Volume of Cylinder : "+a);
    }
    public static void main(String args[])
    {
         float r,h;
         Cylinder ob=new Cylinder();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Radius Of Cylider : ");
         r=sc.nextFloat();
         System.out.println("Enter Hight Of Cylider : ");
         h=sc.nextFloat();
         ob.area(r,h);
         ob.volume(r,h);
    }
}