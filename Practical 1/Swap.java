class Swap
{
	public static void main(String cp[])
	{
		int a=Integer.parseInt(cp[0]);
		int b=Integer.parseInt(cp[1]);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After swapping the numbers are: a="+a+" b="+b);	
	}
}