class Calculator
{
	public static void main(String cp[])
	{
		int a=Integer.parseInt(cp[0]);
		String op= cp[1];
		int b=Integer.parseInt(cp[2]);

		switch(op)
		{
			case "+":
				System.out.print("Addition= "+ (a+b));
				break;
			case "-":
				System.out.print("Substraction= "+ (a-b));
				break;
			case "x":
				System.out.print("Multiplication= "+ (a*b));
				break;
			case "/":
				System.out.print("Division= "+ (a/b));
				break;
			case "%":
				System.out.print("Remainder= "+ (a%b));
				break;

		}
	}
}