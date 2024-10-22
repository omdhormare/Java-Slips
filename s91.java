class demo
{
    public static void main(String argc[])
    {
        int i,j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((j+i)%2==0)
                  System.out.print("1"+"");
                else
                  System.out.print("0"+"");
            }
            System.out.print("\n");
        }
    }
}