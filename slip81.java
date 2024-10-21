import java.io.*;
class demo
{
    public static void main(String argc[])
    {
        File f1=new File("C:\\om11");
        if(f1.isDirectory())
        {
            String s1[]=f1.list();
            for(int i=0;i<s1.length;i++)
            {
                String fname=s1[i];
                if(fname.endsWith(".java"))
                {
                    System.out.print("\n"+fname);
                }
            }
        }
    }
}