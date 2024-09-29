import java.util.Scanner; // Importing Scanner class for user input

public class main {

    // Constants for conversion factors
    private static final double SECONDS_IN_MINUTE = 60.0;
    private static final double SECONDS_IN_HOUR = 3600.0;
    private static final double MINUTES_IN_HOUR = 60.0;

    // Generic method to handle all time conversions
    public double convertTime(double value, double conversionFactor) {
        return value * conversionFactor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input

        main clock = new main();  // Instantiate the main class to access the methods
        char continueConverting;  // Variable to store user decision to continue or not

        // Display program introduction
        System.out.println("zun\nLaboratory Exercise");

        do {
            // Menu for choosing conversion type
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");

            System.out.print("Choose the Conversion: ");
            int choice = input.nextInt();  // User chooses which conversion to perform

            System.out.print("Enter the Value: ");
            double value = input.nextDouble();  // User inputs the value to be converted

            double result = 0;  // Initialize result for the conversion
            double conversionFactor = 1;  // Default conversion factor

            // Use array to store conversion factors instead of repeating logic
            switch (choice) {
                case 1:
                    conversionFactor = 1 / SECONDS_IN_MINUTE;  // Seconds to Minutes
                    break;
                case 2:
                    conversionFactor = 1 / SECONDS_IN_HOUR;  // Seconds to Hours
                    break;
                case 3:
                    conversionFactor = SECONDS_IN_MINUTE;  // Minutes to Seconds
                    break;
                case 4:
                    conversionFactor = 1 / MINUTES_IN_HOUR;  // Minutes to Hours
                    break;
                case 5:
                    conversionFactor = SECONDS_IN_HOUR;  // Hours to Seconds
                    break;
                case 6:
                    conversionFactor = MINUTES_IN_HOUR;  // Hours to Minutes
                    break;
                default:
                    System.out.println("Invalid choice!");  // Handle invalid input
                    continue;  // Skip to the next iteration of the loop
            }

            // Perform the conversion using the generic method
            result = clock.convertTime(value, conversionFactor);
            System.out.println("Converted Value: " + result);  // Output the result

            // Ask if the user wants to continue converting
            System.out.print("Do you want to convert again? (Y/N): ");
            continueConverting = input.next().charAt(0);

            System.out.println("------------------------------------------");

        } while (continueConverting == 'Y' || continueConverting == 'y');  // Repeat if user chooses Y or y

        System.out.println("Thank you for using the program :)!");  // Exit message
    }
}
