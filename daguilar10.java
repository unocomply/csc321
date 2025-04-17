//Daira Aguilar


import java.util.*;

public class  daguilar10
{
	public static void main(String[] args)
	{
		int x = 0, y = 0, i = 0;
		double z = 0, radius = 0, height = 0;

		System.out.println("Enter the radius of a cylinder:");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();

		System.out.println("Enter the radius of a height:");
                
                height = input.nextDouble();

		z = calculateArea(radius, height);

		System.out.println("The area of a cylinder is : " + z);


	}

	public static double calculateArea(double radius, double height)
	{
		double area = 3.149 * radius * radius * height;
		return area;
	}

}
