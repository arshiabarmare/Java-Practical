import java.util.Arrays;
class Anagram
{
	public static void main(String cp[])
	{
		String a=cp[0].toLowerCase();
		String b=cp[1].toLowerCase();

		char x[]=a.toCharArray();
		char y[]=b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);

		String s1=new String(x);
		String s2=new String(y);

		if(s1.equals(s2))
		{
			System.out.println("The strings are Anagram.");
		}
		else
		{
			System.out.println("The strings are not Anagram.");
		}
	}	



}