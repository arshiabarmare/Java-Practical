class SUM2
{
	public static void main(String cp[])
	{
		int n=Integer.parseInt(cp[0]);
		int sum=0;
		int sign=1;
		for(int i=1; i<=n; i++)
		{
			sum=sum+(sign*i);
			sign=-sign;
		}

		System.out.println("Sum= "+sum);
	}	
}