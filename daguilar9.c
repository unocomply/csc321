// Daira Aguilar
//


#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void)
{
	int guess , i, x= 3, y;

        srand(time(NULL));


	y = 1 +(rand() %20);

	printf("Enter a number between 1 and 20\n");

	while(guess < 1 || guess > 20 )
	{
	//	printf("Enter a number between 1 and 20\n");
		scanf("%d",&guess);
	
	
		if(guess == y) 
		{
		for(i = 0; i < guess; i++)
		{
		printf("You won and guessed correctly!. This is y = %d\n", y);
		}
		}
	       	else if (guess < y)
		{
		printf("You lost and your guess is lower than my number, %d\n", y);
		}
		else if (guess > y)
		{
		printf("You lost and your guess is higher than my number, %d\n", y);

		 if(guess <  1 || guess > 20 )
                {
                        puts("your imput is out of range(1-20) re-enter value: ");
                }
	}
}
	return EXIT_SUCCESS;

}


