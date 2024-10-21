/*Create a package TYBBACA with two classes as class Student (Rno, SName, Per) 
with a method disp() to display details of N Students and class Teacher (TID, TName, 
Subject) with a method disp() to display the details of teacher who is teaching Java 
subject. (Make use of finalize() method and array of Object) */
import java.util.*;
class Student
{
    int rno,per;
     String sname;
   void accept()
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Roll No : ");
     rno=sc.nextInt();
     System.out.print("Enter Name : ");
     sname=sc.next();
     System.out.print("Enter Percentage : ");
     per=sc.nextInt();
   }
   void dis()
   {
    System.out.println("\nRoll No : "+rno);
    System.out.println("Name : "+sname);
    System.out.println("Percentage : "+per);
   }
}
class teacher extends Student
{
    int tid;
    String sub,tname;
    void acceptT()
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Teacher Id : ");
     tid=sc.nextInt();
     System.out.print("Enter Name : ");
     tname=sc.next();
     System.out.print("Enter Subject : ");
     sub=sc.next();
   }
   void disT()
   {
    System.out.println("\nTeacher Id : "+tid);
    System.out.println("Teacher Name : "+tname);
    System.out.println("Subject : "+sub);
   }
   void teach()
{
    if(sub.equalsIgnoreCase("java")) 
    {
        System.out.println("\n\n\nTeacher Id : "+tid);
        System.out.println("Teacher Name : "+tname);
        System.out.println("Subject : "+sub);
    }
}

    public static void main(String argc[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        n=sc.nextInt();
        teacher[] ob=new teacher[n];
        for(i=0;i<n;i++)
        {
            ob[i] = new teacher();
            ob[i].accept();
            ob[i].acceptT();
        }
        for(i=0;i<n;i++)
        {
            ob[i].dis();
            ob[i].disT();
        }
        for(i=0;i<n;i++)
        {
            ob[i].teach();
        }
    }
}
