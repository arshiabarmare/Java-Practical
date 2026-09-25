class SUM1
{
	public static void main(String cp[])
	{
		int n=Integer.parseInt(cp[0]);
		double s=0;
		for(int i=1; i<=n; i++)
		{
			int fact=1;
			for(int j=1; j<=i; j++)
			{
				fact=fact*j;
			}
			s=s+(double)(i*i)/fact;
		}
		System.out.println("Sum= "+s);
	}	
}