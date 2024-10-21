/*Write a java program to display the files having extension .txt from a given 
directory. */

import java.io.File;

class file1 {
    public static void main(String arc[]) 
    {
        File f = new File("C:\\java_program");
        if (f.isDirectory()) 
        {
            String s1[] = f.list();
            for (int i = 0; i < s1.length; i++) 
            {
                String fname = s1[i];
                if (fname.endsWith(".java")) 
                {
                    System.out.println(fname);
                }
            }
        }
    }
}
