import java.util.Scanner;

public class ReadFloatFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        float userInput = scanner.nextFloat();

        System.out.println("You entered: " + userInput);

        // Remember to close the scanner when you're done with it
        scanner.close();
    }
}
