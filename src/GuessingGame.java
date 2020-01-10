import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    public static void main(String[] args) {
        int input = -1, answer = 64;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("Can you guess it?");

            try {
                input = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid Input!");
                continue;
            }

            if (input == answer)
                System.out.println("**RIGHT**");
            else {
                System.out.println("...Sorry, you're too " + (input < answer ? "low" : "high"));

                System.out.println("Try again!");
            }
        } while (answer != input);
    }
}