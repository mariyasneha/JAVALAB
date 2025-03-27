import java.util.Scanner;

public class StringManipulation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter a string:");
        String str=sc.nextLine();
       
        System.out.println("Length of string:"+str.length());
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Substring (2 to 5):"+str.substring(2,5));
        System.out.println("After Trim:"+str.trim());
        System.out.println("String contains ll:"+str.contains("ll"));
        System.out.println("String ends with ll:"+str.endsWith("ll"));
        System.out.print("Enter another string:");
        String str2=sc.nextLine();
        System.out.println("String 1 equals to string 2:"+str.equals(str2));
        System.out.println("String after replace 'l' with 'p':"+str.replace('l','p'));
        sc.close();
    }
}
