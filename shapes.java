import java.util.*;
interface shape{
	void area();
	void perimeter();
}
class circle implements shape{
	int r;
	double pi=3.14;
	circle(int r){
		this.r=r;
	}
	public void area(){
		double area=pi*r*r;
		System.out.println("Area is:"+area);
	}
	public void perimeter(){
		double peri=2*pi*r;
		System.out.println("Perimeter is:"+peri);
	}
}
class rectangle implements shape{
	int l;
	int b;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		int area=l*b;
		System.out.println("Area is:"+area);
	}
	public void perimeter(){
		int peri=2*(l+b);
		System.out.println("Perimeter is:"+peri);
	}
}
public class shapes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
			System.out.println("\n=== Menu ===");
            System.out.println("1. Calculate area and perimeter of a circle");
            System.out.println("2. Calculate area and perimeter of a rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
            case 1:
				System.out.println("Enter the radius of circle:");
				int r=sc.nextInt();
				circle cir=new circle(r);
				cir.area();
				cir.perimeter();
				break;
			case 2:
				System.out.println("Enter length of rectangle:");
				int l=sc.nextInt();
				System.out.println("Enter breadth of rectangle:");
				int b=sc.nextInt();
				rectangle rect=new rectangle(l,b);
				rect.area();
				rect.perimeter();
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(choice !=3);
		sc.close();
	}
}
