/*B) Write a java program to accept the details of employee (Eno, EName, Sal) and 
   display it on next frame using appropriate event .  */
   import java.awt.*;
   import java.awt.event.*;
   
   class Emp extends Frame implements ActionListener 
   {
       Button b1;
       TextField t1, t2, t3;
       Label l1, l2, l3;
   
       Emp() 
       {
           setVisible(true);
           setSize(400, 400);
           setLayout(new GridLayout(4,4));
   
           l1 = new Label("Enter Eno: ");
           add(l1);
           t1 = new TextField(5);
           add(t1);
   
           l2 = new Label("Enter Name: ");
           add(l2);
           t2 = new TextField(10);
           add(t2);
   
           l3 = new Label("Enter Salary: ");
           add(l3);
           t3 = new TextField(10);
           add(t3);
   
           b1 = new Button("Next Frame");
           add(b1);
   
           b1.addActionListener(this);
       }
   

       public void actionPerformed(ActionEvent e) 
       {
           String a1 = t1.getText();
           String a2 = t2.getText();
           String a3 = t3.getText();
   
           new Emp1(a1, a2, a3);
       }
   
       public static void main(String[] args) 
       {
           new Emp();
       }
   }
   

   class Emp1 extends Frame 
   {
       Label L11, L22, L33;
   
       Emp1(String eno, String name, String salary) 
       {
           setVisible(true);
           setSize(400, 400);
           setLayout(new GridLayout(4, 2));
   
           L11 = new Label("Eno: " + eno);
           add(L11);
   
           L22 = new Label("Name: " + name);
           add(L22);
   
           L33 = new Label("Salary: " + salary);
           add(L33);
       }
   }
   