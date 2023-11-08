public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Hello, World!"; 
        
        int charCount = countCharacters(inputString);

        System.out.println("Total number of characters: " + charCount);
    }

    public static int countCharacters(String input) {
        return input.length();
    }
}
