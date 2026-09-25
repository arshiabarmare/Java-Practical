import java.util.Scanner;
class Generate_Username{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Name: ");
		String a=sc.next();

		System.out.print("Enter last Name: ");
		String b=sc.next();

		StringBuilder sb=new  StringBuilder();
		sb.append(a.toLowerCase());
		sb.append(".");
		sb.append(b.toLowerCase());
		System.out.print("Generated username: "+sb);
	}
}