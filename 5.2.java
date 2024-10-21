import java.io.*;
class demo 
{
    public static void main(String argc[]) throws IOException
    {
        for(int i=0;i<argc.length;i++)
        {
            File f=new File(argc[i]);
            if(f.isFile())
            {
                String s=f.getName();
                System.out.print("\nFile Location : "+f.getAbsolutePath());
                System.out.print("\nFile Size : "+f.length());
                if(s.endsWith("txt"))
                {
                    f.delete();
                    System.out.print("\nDelete File Name : "+f.getName());
                }
                else
                  System.out.print("File Not Found.");
            }
        }
    }
}