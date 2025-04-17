// Daira Aguilar

#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void)
{
	int i, x = 0;
	float y = 1.2;
	double z = 30.00;
	char a = 'B';

	int arr[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	printf("the value of x is %d and its address is %p \n",x,&x);
	printf("the value of y(float) is %.2f and its address is %p \n",y,&y);
	printf("the value of z(double)  is %.10f and its address is %p \n",z,&z);
	printf("the value of a(char) is %c and its address is %p \n",a,&a);
	{
		int y = 10;
	}
	//printf("the value of y  is %d \n",y);
	
	for(i = 0; i < 10;i++)
	{
		printf("addresses of arr[%d] = %p \n", arr[i],&arr [i]);
	}

	return EXIT_SUCCESS;
}

