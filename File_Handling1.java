import java.io.*;
class test
{
    public static void main(String argc[])  throws IOException
    {
        File f=new File("first.txt");

        if(f.createNewFile())
        System.out.print("File Created...");
        else
        System.out.print("Not Create file..");
    }
}