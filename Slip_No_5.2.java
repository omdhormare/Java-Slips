/*B) Write a java program to accept list of file names through command line. Delete the files 
having extension .txt. Display name, location and size of remaining files. */
import java.io.*;
class file
{
    public static void main(String[] args) throws IOException
    {
        int i;
        for(i=0;i<args.length;i++)
        {
            File f=new File(args[i]);

            if(f.isFile())
            {
                String name=f.getName();

                System.out.print("\nFile Location : "+f.getAbsolutePath());
                System.out.print("\nFile Size : "+f.length()+ "Bytes");

                if(name.endsWith(".txt"))
                {
                    f.delete();
                    System.out.println("\nFile Delete Name : "+f.getName());
                }
                else
                 System.out.print("File Not Found ..");
            }
        }
    }
}