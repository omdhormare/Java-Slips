class ABC{
    public static void main(String args[]) 
    {
        try {
            int a = 200;
            int b=a/0;
            System.out.print(b);
        }catch(Exception e) 
        {
            System.out.print(e);
        }
    }
}
