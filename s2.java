import java.io.*;
class demo
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1=new FileInputStream("s1.txt");
        FileOutputStream f2=new FileOutputStream("s2.txt");

        int i;
         while((i=f1.read())!=-1)
         {
            if(!Character.isDigit((char) i))
            {
                f2.write(i);
            }
         }
    }
}