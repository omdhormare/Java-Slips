import java.io.*;
class demo1
{
    public static void main(String[] args) throws IOException
    {
        int i;
        for(i=0;i<args.length;i++)
        {
            File f=new File(args[i]);
            if(f.isFile())
            {
                String s1= f.getName();
                System.out.print("File Directory Path : "+f.getAbsolutePath());
                System.out.print("File Size : "+f.length());
            if(s1.endsWith("txt"))
            {
                f.delete();
                  System.out.print("Delete file Name : "+f.getName());
            }
            else
              System.out.print("File Not Found...");
        }
        }
    }
}