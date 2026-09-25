class Account{
	int bal=60000;
}

class Deposit extends Thread{
	Account a;

	Deposit(Account a){
		this.a=a;
	}

	public void run(){
		a.bal+=5000;
		System.out.println("Deposited successfully.");
		System.out.println("balance:"+ a.bal);
	}
}

class withdraw extends Thread{
	Account a;

	withdraw(Account a){
		this.a=a;
	}

	public void run(){
		a.bal-=2000;
		System.out.println("Withdrawed successfully.");
		System.out.println("balance:"+ a.bal);
	}
}

class Bank{
	public static void main(String cp[]){
		Account a=new Account();

		Deposit d=new Deposit(a);
		withdraw w=new withdraw(a);
		
		d.setPriority(Thread.MAX_PRIORITY);
		w.setPriority(Thread.MIN_PRIORITY);

		d.start();
		w.start();
	}
}



class Account{
    int bal=60000;

    synchronized void deposit(){
        bal+=5000;
        System.out.println("Deposited successfully.");
        System.out.println("balance: "+bal);
    }

    synchronized void withdraw(){
        bal-=2000;
        System.out.println("Withdrawn successfully.");
        System.out.println("balance: "+bal);
    }
}

class Deposit extends Thread{
    Account a;

    Deposit(Account a){
        this.a=a;
    }

    public void run(){
        a.deposit();
    }
}

class withdraw extends Thread{
    Account a;

    withdraw(Account a){
        this.a=a;
    }

    public void run(){
        a.withdraw();
    }
}

class Bank{
    public static void main(String cp[]){
        Account a=new Account();

        Deposit d=new Deposit(a);
        withdraw w=new withdraw(a);

        d.start();
        w.start();
    }
}