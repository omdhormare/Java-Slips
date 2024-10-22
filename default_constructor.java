class Student
{
    int rno=101,per=92;
    String name="om";
    Student()
    {
         System.out.println("Student Roll No : "+rno);
         System.out.println("Student Name : "+name);
         System.out.println("Student per : "+per);
    }
}
class test
{
    public static void main(String arg[])
    {
        new Student();
    }
}