import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStringFromUser {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String userInput = reader.readLine();
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
