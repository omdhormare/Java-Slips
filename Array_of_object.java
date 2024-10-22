import java.util.*;

class Student 
{
   int rno, per;
   String name;

   void Accept() 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Student Roll No : ");
      rno = sc.nextInt();
      System.out.println("Enter Student Name : ");
      name = sc.next();
      System.out.println("Enter Student Per : ");
      per = sc.nextInt();
   }

   void dis() 
   {
      System.out.println("Student Roll No : " + rno);
      System.out.println("Student Name : " + name);
      System.out.println("Student per : " + per);
   }
}

class Demo {
    public static void main(String argc[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j;

        System.out.print("Enter Limit: ");
        n = sc.nextInt();
        Student ob[] = new Student[n];
        for (i = 0; i < n; i++) {
            ob[i] = new Student();
            ob[i].Accept();
        }
        for (i = 0; i < n; i++) 
        {
            ob[i].dis();
        }
        for (i = 0; i < n - 1; i++) 
        {
            for (j = 0; j < n - 1 - i; j++) 
            {
                if (ob[j].per < ob[j + 1].per) 
                { 
                    Student temp = ob[j];
                    ob[j] = ob[j + 1];
                    ob[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted students by percentage in descending order:");
        for (i = 0; i < n; i++) 
        {
            ob[i].dis();
        }
    }
}
