// Daira Aguilar
// Lab 11

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double hypotenuse(int height, int base);

int main(void)
{
	int base, height;
	double result;

	printf("enter height of the triangle: ");
	scanf("%d", &height);

	 printf("enter base of the triangle: ");
        scanf("%d", &base);

	result = hypotenuse(base,height);


	printf("The length of your hypotenuse is: %lf \n", result);


	return EXIT_SUCCESS;

}

double hypotenuse(int height, int base)
{
	double x = sqrt(height * height + base * base);
	return x;
}
