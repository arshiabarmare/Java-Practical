class SumOfDigit
{
	public static void main(String cp[])
	{
		int num=Integer.parseInt(cp[0]);
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			num=num/10;
			sum=sum+last;
		}
		System.out.print("Sum= "+sum);	
	}
}