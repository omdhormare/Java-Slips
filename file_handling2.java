import java.io.*;
class test
{
    public static void main(String argc[]) throws IOException
    {
        File f=new File("first1.txt");
        if(f.exists())
        {
            System.out.println("File Name : "+f.getName());
            System.out.println("File Length : "+f.length());
            System.out.println("File ReadAble : "+f.canRead());
            System.out.print("File WritAble : "+f.canWrite());
        }
        else
        System.out.print("File Not Exists..");
    }
}