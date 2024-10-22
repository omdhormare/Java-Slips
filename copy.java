class demo 
{
    String a;
    String b;
    demo()
    {
        a="om";
        b="dada";
        System.out.print(a+" "+b);
    }

    demo(demo ob)
    {
      a=ob.a;
      b=ob.b;
      System.out.println("\n" +a+" "+ b);
    }
}
class a
{
    public static void main(String argc[])
    {
        demo ob=new demo();
        demo ob1=new demo(ob);
    }
}
