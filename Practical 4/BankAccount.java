import java.util.Scanner;
class BankAccount{
	long AccNumber;
	String AccName;
	double Balance;

	BankAccount(){
		AccNumber=0;
		AccName="Unknown";
		Balance=0;
	}

	BankAccount(long number, String name, double bal){
		AccNumber=number;
		AccName=name;
		Balance=bal;
	}

	public void deposit(double DepositAmt){
		Balance=Balance+DepositAmt;
		System.out.println(DepositAmt+ " is Deposited.");		
	}
	
	public void withdraw(double withdrawAmt){
		if(withdrawAmt>Balance){
			System.out.println("Not Sufficient balance.");
		}
		else{
			Balance=Balance-withdrawAmt;
			System.out.println(withdrawAmt+ " is withdrawed.");	
		}
	}
	
	public void displayBal(){
		System.out.println("Balance: "+Balance);
	}

	public void displayAccDetails(){
		System.out.println("Account Number: "+ AccNumber);
		System.out.println("Account Holder Name: "+ AccName);
		System.out.println("Balance: "+ Balance);
	}
}

class BankAccManagement3{
	public static void main(String cp[]){

		Scanner sc=new Scanner(System.in);

		BankAccount []a=new BankAccount[5];
		System.out.println("Enter details of 5 Customers: ");
		for(int i=0; i<5; i++){
			System.out.println("Enter Acc Number: ");
			long AccNumber=sc.nextLong();
			sc.nextLine();

			System.out.println("Enter Acc Holder Name: ");
			String AccName=sc.nextLine();

			System.out.println("Enter Balance: ");
			double Balance=sc.nextDouble();

			a[i]=new BankAccount(AccNumber, AccName, Balance);
			System.out.println();
		}
		for(int i=0; i<a.length; i++){
			a[i].displayAccDetails();
		}
		sc.close();
	}
}