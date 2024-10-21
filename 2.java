import java.io.*;
class demo
{
    public static void main(String argc[]) throws IOException
    {
        FileInputStream f1 = new FileInputStream("f1.txt");
        FileOutputStream f2 = new FileOutputStream("f2.txt");

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