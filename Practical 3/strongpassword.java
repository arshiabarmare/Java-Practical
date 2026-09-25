import java.util.Scanner;
class strongpassword{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Password: ");
		String p=sc.next();

		Boolean upper=false;	
		Boolean lower=false;
		Boolean digit=false;
		Boolean special=false;

		for(int i=0; i<p.length(); i++){
			char ch=p.charAt(i);
			if(ch>='A' && ch<='Z'){
				upper=true;
			}
			else if(ch>='a' && ch<='z'){
				lower=true;
			}
			else if(ch>='0' && ch<='9'){
				digit=true;
			}
			else{
				special=true;
			}
		}
		if(p.length()>8 && upper && lower && digit && special){
			System.out.print("Strong Password.");
		}
		else{
			System.out.print("Weak Password.");
		}
	}
}