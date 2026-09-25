class LeapYear
{
	public static void main(String cp[])
	{
		int a=Integer.parseInt(cp[0]);
		if ((a%400==0)||(a%4==0 && a%100!=0))
		{
			System.out.println("The year "+a+" is a Leap year.");
		}
		else
		{
			System.out.println("The year "+a+" is not a Leap year.");
		}	
	}
}