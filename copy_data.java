//B) Write a java program to copy only non-numeric data from one file to another file.
import java.io.*;
class demo
{
    public static void main(String argc[]) throws IOException
    {
        FileInputStream f1=new FileInputStream("one.txt"); //input Data these file
        FileOutputStream f2=new FileOutputStream("Two.txt");// input data store these file

        int i;
        while((i=f1.read())!=-1)
        {
           if(!Character.isDigit((char) i))
            f2.write(i);
        }
    }
}