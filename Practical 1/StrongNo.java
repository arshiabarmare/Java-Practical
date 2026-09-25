class StrongNo
{
	public static void main(String cp[])
	{
		int n=Integer.parseInt(cp[0]);
		int temp=n;
		int sum=0;
		//System.out.println(n);
		while(n>0)
		{
			int digit=n%10;
			int fact=1;
			for(int i=1; i<=digit; i++)
			{
				fact=fact*i;
			}			
			sum=sum+fact;
			n=n/10;
		}
		//System.out.println(sum);
		//System.out.println(n);
		if(temp==sum)
		{
			System.out.println("The number "+temp+" is a Strong number.");
		}
		else
		{
			System.out.println("The number "+temp+" is not a Strong number.");
		}

	}	
}