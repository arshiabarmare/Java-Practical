import java.util.Scanner;
import java.util.InputMismatchException;
class StudentResult{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter name: ");
			String s=sc.next();
			System.out.println("Enter no of sub: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter marks of sub: ");
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			try{
				int sum=0;
				for(int i=0; i<n; i++){
					sum=sum+a[i];
				}
				int avg= sum/n;
				System.out.println("Average= "+avg);
			}

			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception: Cannot divide by zero.");
			}

			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBound Exception: Invalid Index.");
			}
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatch Exception: Enter number and not text.");
		}

	}
}