import java.io.*;
class demo
{
    public static void main(String argc[]) throws IOException
    {
        FileReader f=new FileReader("first.txt");

        int i;
        while((i=f.read())!=-1)
        {
            System.out.print((char)i);
        }
    }
}