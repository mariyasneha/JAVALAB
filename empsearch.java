import java.util.Scanner;
class Employee{
    int eNo;
    String eName;
    int eSalary;
    Employee(int eNo, String eName, int eSalary){
        this.eNo=eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    public void display(){
        System.out.print("Employee Details:");
        System.out.println(this.eNo+ "," +this.eName+ "," +this.eSalary);
    }
}
public class empsearch{
    public static void main(String[] args){
        Employee employee[] = new Employee[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3;i++){
            System.out.println("Enter the employee no:");
            int eNo=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of the employee:");
            String eName=sc.nextLine();
            System.out.println("Enter the salary:");
            int eSalary=sc.nextInt();
            employee[i]=new Employee(eNo,eName,eSalary);
        }
        System.out.println("Enter employee number to search:");
        int sNo=sc.nextInt();
        boolean f=false;
        for(int i=0;i<3;i++){
            if(employee[i].eNo==sNo){
                System.out.println("Employee Found");
                employee[i].display();
                f=true;
                break;
            }
        }
        if(!f){
            System.out.println("Employee not found");
        }
        sc.close();
    }
}