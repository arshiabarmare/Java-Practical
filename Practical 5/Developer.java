import java.util.Scanner;
class Developer implements Employee{
	int EmpId;
	String Empname;
	double basicsal, hra, da, totalsal;

	public void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId: ");
		EmpId=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Emp Name: ");
		Empname=sc.nextLine();

		System.out.println("Enter basic salary: ");
		basicsal=sc.nextDouble();
	}
	
	public void calculateSalary(){
		hra=basicsal*0.20;
		da=basicsal*0.10;

		totalsal=basicsal+hra+da;	
	}

	public void displaydetails(){
		System.out.println("\n Developer Details: ");
		System.out.println("Emp ID: "+ EmpId);
		System.out.println("Emp Name: "+ Empname);
		System.out.println("Basic Salary: "+ basicsal);
		System.out.println("Total Salary: "+ totalsal);
	} 
}