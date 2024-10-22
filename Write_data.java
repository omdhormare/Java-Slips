import java.io.*;
import java.util.*;

class demo1
{
  public static void main(String argc[]) throws IOException
  {
    FileWriter f=new FileWriter("write_data.txt",true);
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter Any Data In File : ");
    String data=sc.nextLine();
    f.write(data+"\n");

    f.close();
  }
}