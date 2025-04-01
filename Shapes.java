
import java.util.Scanner;
public class Shapes
{
    public int area(int side)
    {
        return side*side;
    }
    public int area(int length,int breadth)
    {
        return length*breadth;
    }
    public float area(float radius)
    {
        return 3.14f * radius * radius;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Shapes calc=new Shapes();
       
        System.out.println("-----SQUARE-----");
        System.out.print("Enter the side:");
        int s=sc.nextInt();
        System.out.println("Area of Square:"+calc.area(s));
        System.out.println("\n");
        System.out.println("-----RECTANGLE-----");
        System.out.print("Enter the length:");
        int l=sc.nextInt();
        System.out.print("Enter the width:");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle:"+calc.area(l,b));
        System.out.println("\n");
        System.out.println("-----CIRCLE-----");
        System.out.print("Enter the radius:");
        float r=sc.nextFloat();
        System.out.println("Area of Circle:"+calc.area(r));
       
    }
}
