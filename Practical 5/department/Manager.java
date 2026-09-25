package department;
import company.Employee;
import java.util.Scanner;

public class Manager implements Employee{
	double basicsalary, hra, da, totalsal;

public void CalculateSalary(){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter basic Salary: ");
	basicsalary=sc.nextDouble();

	hra=basicsalary*0.20;
	da=basicsalary*0.10;

	totalsal=basicsalary+hra+da;

	System.out.println("Total Salary: "+ totalsal);
	}
}