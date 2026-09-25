class Armstrong
{
	public static void main(String cp[])
	{
		int num=Integer.parseInt(cp [0]);
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			num=num/10;
			int cube=last*last*last;
			sum=sum+cube;
		}
		if (temp==sum)
		{
			System.out.println("Armstrong.");
		}		
		else
		{
			System.out.println("Not Armstrong.");
		}
	}
}