class demo{
    public static void main(String argc[])
    {
        String s1="   om   ";
        String s2="om,PATIL";
        System.out.print("Equal : "+s1.equals(s2));
        System.out.println("\nUppercase: "+s1.toUpperCase());
        System.out.println("Lowercase : "+s2.toLowerCase());
        
        System.out.println(s1);
        System.out.println(""+s1.trim());

        System.out.println(s2);
        System.out.println("Replce Character : "+s2.replace('o','A'));
        System.out.println("Replce All : "+s1.replaceAll("om","Topper"));
        
    }
}