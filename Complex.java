import java.util.Scanner;
public class Complex{
	public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the real part of first compelx number:");
	int real1=scan.nextInt();
	System.out.println("Enter the imaginary part of first complex number:");
	int img1=scan.nextInt();
	System.out.println("Enter the real part of second complex number:");
	int real2=scan.nextInt();
	System.out.println("Enter the imaginary part of second complex number:");
	int img2=scan.nextInt();
	int realSum=real1+real2;
	int imgSum=img1+img2;
	
	System.out.println("The sum of complex number is:" + realSum+ "+" + imgSum+ "i");
	scan.close();
}
}
