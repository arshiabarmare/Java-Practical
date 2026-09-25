import java.util.Scanner;
class BankExp{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();

		System.out.println("Enter Balance: ");
		int bal=sc.nextInt();

		System.out.println("Enter amt to withdraw: ");
		int wamt=sc.nextInt();

		try{
			if(wamt>bal){
				throw new IllegalArgumentException("Insufficent bal.");
			}
			bal-=wamt;
			System.out.println("Name: "+name);
			System.out.println("Balance: "+bal);
		}

		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}		
	}
}