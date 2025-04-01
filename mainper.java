import java.util.Scanner;
class Person{
	String Name;
	String Gender;
	String Address;
	int Age;
	Person(String Name,String Gender,String Address,int Age){
		this.Name=Name;
		this.Gender=Gender;
		this.Address=Address;
		this.Age=Age;
	}
	void displayPerson(){
		System.out.println("Name:"+Name);
		System.out.println("Gender:"+Gender);
		System.out.println("Address:"+Address);
		System.out.println("Age:"+Age);
	}
}
class Employee extends Person{
	int Empid;
	String Company_name;
	String Qualification;
	int Salary;
	Employee(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,int Salary){
		super(Name,Gender,Address,Age);
		this.Empid=Empid;
		this.Company_name=Company_name;
		this.Qualification=Qualification;
		this.Salary=Salary;
	}
	void displayEmployee(){
		super.displayPerson();
		System.out.println("Employee id:"+Empid);
		System.out.println("Company name:"+Company_name);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Salary:"+Salary);
	}
}
class Teacher extends Employee{
	String Subject;
	String Department;
	int Teacherid;
	Teacher(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,int Salary,String Subject,String Department,int Teacherid){
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary);
		this.Subject=Subject;
		this.Department=Department;
		this.Teacherid=Teacherid;
	}
	void displayTeacher(){
		super.displayEmployee();
		System.out.println("Subject:"+Subject);
		System.out.println("Department:"+Department);
		System.out.println("Teacher id:"+Teacherid);
	}
}
public class mainper {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of teachers:");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher[] teachers=new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter Name:");
			String Name=sc.nextLine();
			System.out.println("Enter Gender:");
			String Gender=sc.nextLine();
			System.out.println("Enter Address:");
			String Address=sc.nextLine();
			System.out.println("Enter age:");
			int Age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee id:");
			int Empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter company name:");
			String Company_name=sc.nextLine();
			System.out.println("Enter qualification:");
			String Qualification=sc.nextLine();
			System.out.println("Enter salary:");
			int Salary=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Subject:");
			String Subject=sc.nextLine();
			System.out.println("Enter department:");
			String Department=sc.nextLine();
			System.out.println("Enter teacher id:");
			int Teacherid=sc.nextInt();
			sc.nextLine();
			teachers[i]=new Teacher(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary,Subject,Department,Teacherid);
		}
		System.out.println("-------Teacher Details------");
		for(int i=0;i<n;i++){
			teachers[i].displayTeacher();
		}
		sc.close();
	}
}		
