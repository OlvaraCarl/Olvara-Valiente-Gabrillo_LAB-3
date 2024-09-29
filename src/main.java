import java.util.Scanner;

public class main {

    public double SecondsToMinutes(double seconds) {
        return seconds / 60;
    }

    public double SecondsToHours(double seconds) {
        return seconds / 3600;
    }

    public double MinutesToSeconds(double minutes) {
        return minutes * 60;
    }

    public double MinutesToHours(double minutes) {
        return minutes / 60;
    }

    public double HoursToSeconds(double hours) {
        return hours * 3600;
    }

    public double HoursToMinutes(double hours) {
        return hours * 60;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        main clock = new main();
        char continueConverting;
        

        System.out.println("zun\nLaboratory Exercise");

        do {
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
    
            System.out.print("Choose the Conversion: ");
            int choice = input.nextInt();

            double value, result = 0;

            System.out.print("Enter the Value: ");
            value = input.nextDouble();

            switch (choice) {
                case 1:
                    result = clock.SecondsToMinutes(value);
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = clock.SecondsToHours(value);
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = clock.MinutesToSeconds(value);
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = clock.MinutesToHours(value);
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = clock.HoursToSeconds(value);
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = clock.HoursToMinutes(value);
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            
            System.out.print("Do you want to convert time? (Y/N): ");
            continueConverting = input.next().charAt(0);

            System.out.println("------------------------------------------");

        } while (continueConverting == 'Y' || continueConverting == 'y');
        
        System.out.println("Thank you for using the program!");
    }
}