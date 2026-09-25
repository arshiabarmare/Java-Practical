import java.util.Scanner;
class SavingAcc implements BankAccountInterface{
	double damount, wamount, balance;

	public void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Initial Bal: ");
		balance=sc.nextDouble();
		System.out.println("Enter amt to be deposited: ");
		damount=sc.nextDouble();
		System.out.println("Enter amt to withdraw: ");
		wamount=sc.nextDouble();
	}

	public void deposit(){
		balance=balance+damount;
		System.out.println("Amount deposited successfully.");
	}

	public void withdraw(){
		if(wamount<balance){
			balance=balance-wamount;
			System.out.println("Amount withdrawed successfully.");
		}
		else{
			System.out.println("Not sufficient balance.");
		}
	}
	
	public void checkbal(){
		System.out.println("Balance: "+balance);
	}
	
}