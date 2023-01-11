import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    /**
     * Takes number input from the console and calculates the sum and average.
     */
    public static void inputThenPrintSumAndAverage() {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Stores the sum of user entered inputs.
        int sum = 0;

        // Stores the count of user entered inputs.
        int count = 0;

        // Stores whether user has entered any valid input.
        boolean userEnteredValidInput = false;

        while (true) {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                userEnteredValidInput = true;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        // Checks if user has entered any valid input.
        if (userEnteredValidInput) {
            System.out.println("SUM = " + sum + " AVG = " + Math.round (sum / (double) count));
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}