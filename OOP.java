import java.util.*;
class student
{
      int rno;
      String name;
        Scanner s=new Scanner(System.in);
     void accept()
        {
             System.out.print("Enter Rno : ");
              rno=s.nextInt();
             System.out.print("Enter Name : ");
              name=s.next();
       }
     void dis()
      {
              System.out.println("Rno : "+rno);
              System.out.println("Name : "+name);
      }
public static void main(String[] abc)
{
     student ob=new student();
     ob.accept();
     ob.dis();
}
}
