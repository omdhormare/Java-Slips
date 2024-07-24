/*A) Write a java Program to accept n no s through command line and store only armstrong nos
 into the array and display that array. */
 class armstrong
 {
    public static void main(String arg[])
    {
        int d,sum=0;
        int n = arg.length;
        int n1=n;
        while(n>0)
        {
           d=n%10;
           sum=sum+d*d*d;
           n=n/10;
        }
        if(n1==sum)
        System.out.print("Armstrong Number : "+n1);
    }
 } 