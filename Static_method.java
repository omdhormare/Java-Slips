class A 
{
     int a=10;
    static void add(int a, int b) 
    {
        System.out.print("Addtion : " + (a + b));
        System.out.print("Addtion : " + a);
    }

    public static void main(String arg[]) 
    {
        A.add(10, 20);
    }
}
