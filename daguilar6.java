//Daira Aguilar
//Arithmetic Expression
//2/25/2025


public class ArithmeticEvaluation
{
	public static void main(String[] args)
	{
		int x = 2;
		int y = 1;

		double xx = 2.0;
		double yy = 1.0;

		System.out.println("x = 2 & y = 1");
		System.out.println("Integer Evaluations:");
		System.out.println("x + y * x / y - x = " + (x + y * x/ y - x));
		System.out.println("-x - y / x * y + x = " + (-x - y / x * y + x));
		System.out.println("x + y - x / y = " + (x + y - x/ y));

		System.out.println("Double Evaluations:");
                System.out.println("x + y * x / y - x = " + (xx + yy * xx/ yy - xx));
                System.out.println("-x - y / x * y + x = " + (-xx - yy / xx * yy + xx));
                System.out.println("x + y - x / y = " + (xx + yy - xx/ yy));


}
}
