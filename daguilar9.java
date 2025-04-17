// Daira Aguilar
//

import java.util.Scanner;
import java.util.Random;


public class daguilar9
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int randNumber = rand.nextInt(20) + 1;

		Scanner scanner = new Scanner(System.in);
		int guess = 0;

		System.out.println("Guess a number between 1 and 20: ");

		while (guess < 1 || guess > 20)
		{
			guess = scanner.nextInt();

			if(guess == randNumber)
			{
				for(int i = 0; i < guess; i++)
				{
					System.out.println("You won and guessed the number correctly !");
				}
			} else if ( guess < randNumber)
			{
				System.out.println("You lost and your guess is lower than my number, " + randNumber);
			} else if (guess > randNumber)
			{
				System.out.println("You lost and your guess is higher than my number, " + randNumber);
			}

			if (guess < 1 || guess > 20)
			{
				System.out.println("Your input is a number that is out of range (1-20). Try again : ");
			}
		}
	}
}
