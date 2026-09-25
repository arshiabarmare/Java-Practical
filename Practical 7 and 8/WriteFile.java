import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		String a;
		try{
			FileWriter w=new FileWriter("JavaFile1.txt");
			System.out.println("Enter text: ");
			a=sc.nextLine();
			w.write(a);
			w.close();	
			System.out.println("Successsfully written.");
		}
		catch(IOException e){
			System.out.println("Error Occured.");
		}
	}
}