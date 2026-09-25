class ATMtransaction implements Runnable{
	public void run(){
		try{
			System.out.println("Card inserted.");
			Thread.sleep(1000);

			System.out.println("PIN verified.");
			Thread.sleep(1000);

			System.out.println("Transaction processing.");
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted.");
		}
	}
}

class notification implements Runnable{
	public void run(){
		try{
			System.out.println("Checking balance.");
			Thread.sleep(1000);

			System.out.println("Amount debited.");
			Thread.sleep(1000);

			System.out.println("SMS sent.");
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted.");
		}
	}
}

class ATM{
	public static void main(String cp[]){
		ATMtransaction a=new ATMtransaction();
		notification b=new notification();

		Thread t1=new Thread(a);
		Thread t2=new Thread(b);

		t1.start();
		t2.start();
	}
}