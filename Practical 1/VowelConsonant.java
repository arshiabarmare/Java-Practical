class VowelConsonant
{
	public static void main(String cp[])
	{
		String a= cp[0].toLowerCase();
		int vowel=0;
		int consonant=0;
		for(int i=0; i<a.length(); i++)
		{
			char b=a.charAt(i);
			if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
			{
				vowel++;
			}
			else 
			{
				consonant++;
			}
		}
		System.out.println("Vowels= "+vowel);
		System.out.println("Consonant= "+consonant);

	}
}