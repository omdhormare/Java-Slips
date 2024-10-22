import java.util.*;
class student_info
{
    int rno;
    String name;
    float per,total,Advance_php,networking,OS,CPP,practicle,project;
   void accept()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Student Roll No : ");
       rno=sc.nextInt();
       System.out.print("Enter Student Name : ");
       name=sc.next();
       System.out.print("Enter Advance php Mark: ");
       Advance_php=sc.nextFloat();
       System.out.print("Enter Networking Mark: ");
       networking=sc.nextFloat();
       System.out.print("Enter Oprating System Mark: ");
       OS=sc.nextFloat();
       System.out.print("Enter CPP Mark: ");
       CPP=sc.nextFloat();
       System.out.print("Enter Practicle Mark: ");
       practicle=sc.nextFloat();
       System.out.print("Enter project Mark: ");
       project=sc.nextFloat();
   }
}
class Display extends student_info
{
    void dis()
    {
        total=Advance_php+networking+OS+CPP+practicle+project;
        per=total/6;
        System.out.println("Student Roll No : "+rno);
        System.out.println("Student Name : "+name);
        System.out.println("Student Total Mark : "+total);
        System.out.println("Student Percentage : "+per);
        if(per>=90)
           System.out.println("Grade : O");
        else if(per>=75)
           System.out.println("Grade : A+");
        else if(per>=60)
           System.out.println("Grade : A");      
        else if(per>=50)
           System.out.println("Grade : B");    
        else if(per>=45)
           System.out.println("Grade : C");    
        else
        System.out.println("Grade : F");         
    }
}
class Demo
{
    public static void main(String args[])
    {
        Display ob=new Display();
        ob.accept();
        ob.dis();
    }
}