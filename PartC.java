import java.util.Scanner;
import java.util.Random;

public class PartC
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int die1, die2, die3, total;
        int play = 1;

        //int die1 = rnd.nextInt(6) + 1;

        System.out.println("Task 8");
        while(play == 1)
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            total = die1 + die2 + die3;

            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------");
            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", 1, die1, die2, die3, total);

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            total = die1 + die2 + die3;
            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", 2, die1, die2, die3, total);

            System.out.println("Play again? (1-yes 0-no)");
            play = in.nextInt();
        }


    }
}
