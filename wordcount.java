public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample sentence. Count the words!";

        int wordCount = countWords(inputString);

        System.out.println("Total number of words: " + wordCount);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
