class Number
{
    public static void main(String argc[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print(" "+"1");
                else
                System.out.print(" "+"0");

            }
            System.out.print("\n");
        }
    }
}