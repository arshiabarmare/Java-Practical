class Prime
{
	public static void main(String cp[])
	{
		for(int i=2; i<=500; i++)
		{
			int ctr=0;
			for(int c=2; c<i; c++)
			{
				if(i%c==0)
				{
					ctr=ctr+1;
				}
			}
			if(ctr==0)
			{
				System.out.println(i);
			}			
		}
	}
}