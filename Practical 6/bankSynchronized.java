class Account{
	double bal=60000;

	synchronized void deposit(double damt){
		bal+=damt;
	}

	synchronized void withdraw(double wamt){
		bal-=wamt;
	}
}

class deposit extends Thread{
	Account a;

	deposit(Account a){
		this.a=a;
	}

	public void run(){
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
		a.withdraw(6000);
		System.out.println("Bal after withdraw: "+ a.bal);
	}
}


class bankSynchronized{
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

