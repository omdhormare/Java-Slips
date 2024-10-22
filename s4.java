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
    float r,h,res;
  void accept()
  {
    System.out.print("Enter Cone Radius : ");
    r=sc.nextFloat();
    System.out.print("Enter Cone hight : ");
    h=sc.nextFloat();
  }
  void area()
  {
     res=(2*super.PI*h*r) + (2*super.PI*h*r);
     System.out.print("Area of Cone: "+res);
  }
  void volume()
  {
     res=2*super.PI*h*r;
     System.out.print("Volume of cone : "+res);
  }
}
class cylinder extends shape
{
    float r,h,res;
  void acceptC()
  {
    System.out.print("Enter cylinder Radius : ");
    r=sc.nextFloat();
    System.out.print("Enter cylinder hight : ");
    h=sc.nextFloat();
  }
  void area()
  {
     res=2*super.PI*h*r*2;
     System.out.print("Area of cylinder: "+res);
  }
  void volume()
  {
     res=2*super.PI*h*r*super.PI;
     System.out.print("Volume of cylinder : "+res);
  }
}
class demo
{
    public static void main(String[] args) 
    {
        cone ob=new cone();
        cylinder ob1=new cylinder();
        ob.accept();
        ob1.acceptC();
        ob.area();
        ob.volume();
        ob1.area();
        ob1.volume();
    }
}