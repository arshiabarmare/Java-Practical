//Q6 and Q7
class Account{
	double bal=60000;

	void deposit(double damt){
		bal+=damt;
	}

	void withdraw(double wamt){
		bal-=wamt;
	}
}

class deposit extends Thread{
	Account a;

	deposit(Account a){
		this.a=a;
	}

	public void run(){
		System.out.println("Dposite priority: "+ getPriority());
		a.deposit(5000);
		System.out.println("Bal after deposit: "+ a.bal);
	}
}

class withdraw extends Thread{
	Account a;

	withdraw(Account a){
		this.a=a;
	}

	public void run(){
		System.out.println("Withdraw priority: "+ getPriority());
		a.withdraw(6000);
		System.out.println("Bal after withdraw: "+ a.bal);
	}
}


class bankaccApplication{
	public static void main(String cp[]){
		Account a=new Account();
		deposit d=new deposit(a);
		withdraw w=new withdraw(a);

		d.start();
		d.setPriority(Thread.MAX_PRIORITY);
		w.start();
		w.setPriority(Thread.MIN_PRIORITY);
	}
}

