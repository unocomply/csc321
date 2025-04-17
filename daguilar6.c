// Daira Aguilar
// Arithmetic Expressions
// 2/25/2025


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{

int x = 2;
int y = 1;
double xx = 2.0;
double yy = 1.0;

printf("x = 2 & y = 1\n");
printf("Integer Evaluations: \n");
printf("x + y * x / y - x = %d\n", x + y * x / y - x);
printf("-x - y / x * y + x = %d\n", -x - y / x * y + x);
printf("x + y - x / y = %d\n", x + y - x / y);

printf("Double Evaluation\n");
printf("x + y * x / y - x = %.2f\n", xx + yy * xx / yy - xx);
printf("-x - y / x * y + x = %.2f\n", -xx - yy / xx * yy + xx);
printf("x + y - x / y = %.2f\n", xx + yy - xx / yy);


return EXIT_SUCCESS;
}
