/*B) Write a ‘java’ program to copy only non-numeric data from one file to another file. */
import java.io.*;
class copy
{
    public static void main(String argc[]) throws IOException
    {
        FileInputStream f1=new FileInputStream("one.txt");
        FileOutputStream f2 =new FileOutputStream("Two.txt");

        int i;
        while((i=f1.read())!=-1)
        {
            if(!Character.isDigit ((char) i))
            {
                f2.write(i);
            }
        }
    }
}