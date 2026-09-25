class Fibonacci
{
	public static void main(String cp[])
	{
		int n=Integer.parseInt(cp[0]);
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=3; i<=n; i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}