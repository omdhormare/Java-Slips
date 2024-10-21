//B) Write a java program to copy only non-numeric data from one file to another file.
import java.io.*;
class file
{
    public static void main(String arg[]) throws IOException
    {
       FileInputStream ob=new FileInputStream("f1.txt");
       FileOutputStream ob1=new FileOutputStream("f2.txt");

       int i;
       while((i=ob.read())!=-1)
       {
         if(!Character.isDigit((char)i))
         {
           ob1.write(i);
         }
       }
    }
}

