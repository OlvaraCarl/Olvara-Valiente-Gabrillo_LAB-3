## Introduction to the Time Conversion Program
This program is designed to perform basic time unit conversions between seconds, minutes, and hours. The goal is to provide a user-friendly interface where a user can input a value and select a conversion type, and the program will output the converted time. The program supports six different types of conversions:

() Seconds to Minutes
() Seconds to Hours
() Minutes to Seconds
() Minutes to Hours
() Hours to Seconds
() Hours to Minutes

The code is structured in a way that uses a generic method to handle all conversions, making it both efficient and easy to maintain. Instead of writing individual methods for each conversion, the program uses conversion factors to perform the necessary calculations.

## Key Features:
User Interaction:The program accepts input from the user and allows them to select which time conversion they want to perform.
Reusability: A single method convertTime is used for all conversions, reducing redundancy in the code.
Loop for Multiple Conversions: After each conversion, the program asks if the user wants to perform another conversion, allowing repeated use without restarting the program.
Input Validation: The program handles invalid choices by prompting the user again for valid input.

## Example of Program Usage:
Let's say you want to convert 3600 seconds into hours. Here's how the program would work:

() The user is prompted to select a conversion type, and they choose Seconds to Hours.
() The user is then asked to input the number of seconds they wish to convert (in this case, 3600).
() The program calculates the conversion and outputs the result:

Choose the Conversion:

[1] Seconds to Minutes
[2] Seconds to Hours
[3] Minutes to Seconds
[4] Minutes to Hours
[5] Hours to Seconds
[6] Hours to Minutes
Choose the Conversion: 1
Enter the Value: 60
Converted Value: 1.0
Do you want to convert again? (Y/N): N
