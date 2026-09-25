class Oddnum
{
	public static void main(String cp[])
	{
		int ctr=0;
		for(int c=1; c<=500; c++)
		{
			if (c%2!=0)
				ctr=ctr+1;
		}
		System.out.println(ctr);
	}
}