class Demo
{
    Demo()//Default Constructor
    {
      System.out.println("Hello");
    }
    Demo(int a,int b)//Parameterize conctructor
    {
        int c=a+b;
        System.out.println("Addtion : "+c);
    }
    Demo(int a,int b,int c)
    {
        System.out.println("Addtion : "+(a+b+c);
    }
    public static void main(String args[])
    {
        Demo ob=new Demo();
        Demo ob1=new Demo(10,20);
        Demo ob2=new Demo(10,20,30);
    }
}