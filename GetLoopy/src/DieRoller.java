import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int rollCount = 0;
            boolean isTriple = false;

            System.out.println("Roll   Die1   Die2   Die3   Sum");
            System.out.println("---------------------------------");

            while (!isTriple) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-6d %-6d %-6d %d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                }
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("Y"));

        input.close();
    }
}
