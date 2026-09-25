abstract class Payment{
	double amount;

	Payment(double amt){
		amount= amt;
	}

	void displayReceipt(){
		System.out.println("Transaction total: "+ amount);
	}

	abstract void processpayment();
}

class CryptoPayment extends Payment{
	String WalletAdd;

	CryptoPayment(double amount, String add){
		super(amount);
		WalletAdd=add;
	}

	void processpayment(){
		System.out.println("Transfered.");
		System.out.println("Wallet Address: "+ WalletAdd);
	}
}

class DigitalPaymentGateway{
	public static void main(String cp[]){
		CryptoPayment c=new CryptoPayment(5000, "34556AB09N");
		c.displayReceipt();
		c.processpayment();
	}	
}
