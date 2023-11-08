public class AverageCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
