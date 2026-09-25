import java.util.Scanner;
import java.util.InputMismatchException;
class StudentMarks{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter no of sub: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter marks of sub: ");
			int sum=0;
			for(int i=0; i<n; i++){
				String b=sc.next();
				a[i]=Integer.parseInt(b);
				sum=sum+a[i];
			}
			int avg= sum/n;
			System.out.println("Average= "+avg);
		}

		catch(InputMismatchException e){
			System.out.println("InputMismatch Exception: Enter number and not text.");
		}

		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception: Cannot divide by zero.");
		}

		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBound Exception: Invalid Index.");
		}

		catch(NumberFormatException e){
			System.out.println("NumberFormat Exception: marks are entered as a string and converted to an integer incorrectly.");
		}
	}
}