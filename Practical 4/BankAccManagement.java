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

class BankAccManagement{
	public static void main(String cp[]){
		BankAccount b1=new BankAccount();

		BankAccount b2=new BankAccount(567894560, "Raj", 20000);

		System.out.println("\n Defaul Constructor Customer: ");
		b1.displayAccDetails();

		System.out.println("\n Parameterized Constructor Customer: ");
		b2.displayAccDetails();	
		b2.deposit(2000);
		b2.withdraw(4000);

		System.out.println("\n After deposit n withdraw: ");
		b2.displayAccDetails();	
		b2.displayBal();
	}
}