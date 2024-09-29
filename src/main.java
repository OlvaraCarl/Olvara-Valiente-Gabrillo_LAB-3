import java.util.Scanner; // Importing Scanner class for user input

public class main {

      // Converts seconds to minutes
    public double SecondsToMinutes(double seconds) {
        return seconds / 60;
    }
    // Converts seconds to hours
    public double SecondsToHours(double seconds) {
        return seconds / 3600;
    }
    // Converts minutes to seconds
    public double MinutesToSeconds(double minutes) {
        return minutes * 60;
    }
     // Converts minutes to hours
    public double MinutesToHours(double minutes) {
        return minutes / 60;
    }
     // Converts hours to seconds
    public double HoursToSeconds(double hours) {
        return hours * 3600;
    }
      // Converts hours to minutes
    public double HoursToMinutes(double hours) {
        return hours * 60;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object to get user input

        main clock = new main();   // Instantiate the main class to access the methods
        char continueConverting;   // Variable to store user decision to continue or not
        
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
            int choice = input.nextInt(); // User chooses which conversion to perform

            double value, result = 0; // Initialize value for user input and result for the conversion

            System.out.print("Enter the Value: ");
            value = input.nextDouble(); // User inputs the value to be converted

              // Perform the conversion based on user's choice
            switch (choice) {
                case 1:
                    result = clock.SecondsToMinutes(value); // Convert seconds to minutes
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = clock.SecondsToHours(value);   // Convert seconds to hours
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = clock.MinutesToSeconds(value); // Convert minutes to seconds
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = clock.MinutesToHours(value); // Convert minutes to hours
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = clock.HoursToSeconds(value); // Convert hours to seconds
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = clock.HoursToMinutes(value); // Convert hours to minutes
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!"); // Handle invalid input
            }

            
            System.out.print("Do you want to convert time? (Y/N): "); // Repeat if user chooses Y or y
            continueConverting = input.next().charAt(0);

            System.out.println("------------------------------------------");

        } while (continueConverting == 'Y' || continueConverting == 'y');
        
        System.out.println("Thank you for using the program :)!"); // Exit message
    }
}
