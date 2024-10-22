                       /*Hierarchical Inheritance */
import java.util.*;
class collage
{
    int cno;
    String cname,address;
    void acceptC()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Collage No : ");
        cno=sc.nextInt();
        System.out.println("Enter Collage Name : ");
        cname=sc.next();
        System.out.println("Enter Collage Address : ");
        address=sc.next();
    }
    void displayC()
    {
        System.out.println("Collage No : "+cno);
        System.out.println("Collage Name : "+cname);
        System.out.println("Collage Address : "+address);
    }
}                      
class Student extends collage
{
    int rno,per;
    String sname;
    void acceptS()
    {
       // Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Roll No  : ");
        rno=sc.nextInt();
        System.out.println("Enter Student Name : ");
        sname=sc.next();
        System.out.println("Enter Percentage : ");
        per=sc.nextInt();
    }
    void displayS()
    {
        System.out.println("Student Roll No : "+rno);
        System.out.println("Student Name : "+sname);
        System.out.println("Percentage : "+per);
    }
}
class Teacher extends collage
{
    int tno,salary;
    String tname;
    void acceptT()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Teacher Roll No  : ");
        tno=sc.nextInt();
        System.out.println("Teacher Name : ");
        tname=sc.next();
        System.out.println("Teacher Salary : ");
        salary=sc.nextInt();
    }
    void displayT()
    {
        System.out.println("Student Roll No : "+tno);
        System.out.println("Student Name : "+tname);
        System.out.println("Percentage : "+salary);
    }
}
class Hierarchical_Inheritance
{
    public static void main(String[] args) 
{
    
    collage ob=new collage();
    Student ob1=new Student();
    Teacher ob2=new Teacher();
    ob.acceptC();
    ob1.acceptS();
    ob2.acceptT();

    ob.displayC();
    ob1.displayS();
    ob2.displayT();
}
}
