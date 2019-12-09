import java.util.Scanner;

public class TwentyOneSticks {

    public static void main(String[] args) {

        int numSticks = 21;
        int numToTake = 0;
        Scanner input = new Scanner(System.in);
        Scanner take = new Scanner(System.in);
        System.out.println("Would you like to go first? (Y/n)");
        String goFirst = input.nextLine();

        while (numSticks > 0) {

            if (goFirst.equalsIgnoreCase("y")) {
                System.out.println("There are " + numSticks + " sticks");
                System.out.println("How many sticks to take? (1 or 2)");
                numToTake = take.nextInt();

                if (numToTake > 2) {
                    numToTake = 2;
                } else if (numToTake < 1) {
                    numToTake = 1;
                }
                numSticks = numSticks - numToTake;

                if (numSticks <= 0) {
                    System.out.println("You lose!");
                } else {
                    if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) {
                        numToTake = 1;
                    } else {
                        numToTake = 2;
                    }
                    System.out.println("Computer takes " + numToTake + " sticks");
                    numSticks = numSticks - numToTake;

                    if (numSticks <= 0) {
                        System.out.println("You win!");
                    }
                }
            } else {

                if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) {
                    numToTake = 1;
                } else {
                    numToTake = 2;
                }
                System.out.println("Computer takes " + numToTake + " sticks");
                numSticks = numSticks - numToTake;
                if (numSticks <= 0) {
                    System.out.println("You win!");
                } else {
                    System.out.println("There are " + numSticks + " sticks");
                    System.out.println("How many sticks to take? (1 or 2)");
                    numToTake = take.nextInt();

                    if (numToTake > 2) {
                        numToTake = 2;
                    } else if (numToTake < 1) {
                        numToTake = 2;
                    } else if (numToTake < 1) {
                        numToTake = 1;
                    }
                    numSticks = numSticks - numToTake;

                    if (numSticks <= 0) {
                        System.out.println("You lose!");
                    }
                }
            }
        }
    }
}
// hint to win:
// 4
// 7
// 10
// 13
// 16
// 19