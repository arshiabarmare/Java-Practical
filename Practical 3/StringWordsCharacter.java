import java.util.Scanner;
class StringWordsCharacter{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Sentence: ");
		String a=sc.nextLine();
		int word=1;
		int character=0;
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)!=' '){
				character++;
			}
			if(a.charAt(i)==' '){
				word++;
			}
		}
		System.out.print("Charaters: "+ character);
		System.out.println();
		System.out.print("Words: "+ word);
	}
}