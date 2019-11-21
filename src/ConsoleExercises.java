    import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("Enter an integer:");
        int userInt = input.nextInt();
        System.out.printf("You entered: %s\n", userInt);

        System.out.println("Enter three words:");

        System.out.printf("%s\n%s\n%s\n", input.next(), input.next(), input.next());

        System.out.println("Enter a sentence:");

        System.out.printf("You entered: %s\n", input.next());

        System.out.println("Enter the room's length followed by width followed by height:");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The area of the room is " + (length * width) + " and the perimeter is " + (width + width + length + length) + " and the volume is " + (width * height * length) + ".");

    }

}
