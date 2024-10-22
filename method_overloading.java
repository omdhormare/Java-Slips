class Demo
{
    void add()
    {
        int a=10;
        int b=20;
        System.out.print("Addtion 1 : "+(a+b));
    }
    void add(int b)
    {
        int a=100;
        System.out.print("\nAddtion 2 : "+(a+b));
    }
    void add(int a,int b)
    {
        System.out.print("\nAddtion 3 : "+(a+b));
    }
    void add(float b)
    {
        int a=10000;
        System.out.print("\nAddtion 4 : "+(a+b));
    }
}
class Demo1
{
    public static void main(String argc[])
{
   Demo ob=new Demo();
   ob.add();
   ob.add(200);
   ob.add(1000,2000);
   ob.add(2000);
}  
}