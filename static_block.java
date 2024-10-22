class Demo
{
    void demo()
    {
        System.out.print("I am Demo Block....");
    }
    static
    {
        System.out.println("I am Static Block...");
    }
    public static void main(String argc[])
    {
        System.out.println("I am Main Block....");
         Demo ob=new Demo();
         ob.demo();
    }
}