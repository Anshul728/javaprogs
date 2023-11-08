import java.util.Scanner;

public class ReadBooleanFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true or false): ");
        String userInput = scanner.next();

        boolean userBoolean = Boolean.parseBoolean(userInput);

        System.out.println("You entered: " + userBoolean);

        
        scanner.close();
    }
}
