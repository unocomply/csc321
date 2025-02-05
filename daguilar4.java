// Daira Aguilar

import java.util.Scanner;

public class daguilar4
{
        public static void main(String[] args)
        {
                int a = 7;
                int b = 21;
                int c = 16;
                int d = 22;

                System.out.println("Pick one lucky number!");
                System.out.println("option 1: 7");
                System.out.println("option 2: 21");
                System.out.println("option 3: 16");
                System.out.println("option 4: 22");

                Scanner scanner = new Scanner(System.in);
                int e = scanner.nextInt();

                if(e  == 7)
                {
                System.out.println("you will earn lots of money in the future.");
                }
                else if (e  == 21)
                {
                System.out.println("you owe me a $1");
                }
                else if (e  == 16)
                {
                System.out.println("chicken butt");
                }
                else if(e  == 22)
                {
                System.out.println("do your homework");
                }
                else
                {
                System.out.println("choose again");
                }

        }
}



