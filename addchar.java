public class AddCharactersToString {
    public static void main(String[] args) {
        String originalString = "Hello, ";
        char newCharacter = 'W';

        
        StringBuilder stringBuilder = new StringBuilder(originalString);
        stringBuilder.append(newCharacter);

        
        String modifiedString = stringBuilder.toString();

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
