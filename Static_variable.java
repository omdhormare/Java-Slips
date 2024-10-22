class static1
{
    static int a=10;
    void show()
    {
        a++;
        System.out.println(a);
    }
    public static void main(String argc[])
    {
        static1 ob=new static1();
        static1 ob1=new static1();
        static1 ob2=new static1();
        ob.show();
        ob1.show();
        ob2.show();
    }
}