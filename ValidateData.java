package validatedata;

import java.util.*;

/**
 * June 3rd, 2021 
 * ICS3U1 
 * The user will enter data into the program at a number of stages.
 * @author Bonny Chen
 */

public class ValidateData {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useDelimiter("\n"); // Scanner will read spaces
        
        // Variable
        String str; 
        int integer;

        System.out.println("\nFollow the instructions to complete each stage.");

        // Stage 1 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 1: Enter a string that is greater than 6 letters long");
            str = reader.nextLine(); // Get the string from the user

            int strLength = str.length(); // Stores the length of the string in a variable

            // Checks if the string length is less than 6 characters
            if (strLength < 6) {

                System.out.println("\nInvalid input, please try again!");

            } else {

                break; // Exits loop

            }
            
        }

        // Stage 2 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 2: Enter a string that contains the letter 'a'");
            str = reader.nextLine(); // Get the string from the user

            boolean containA = str.toLowerCase().contains("a"); // Checks if the string contains the letter 'a' and stores it as a boolean

            // Checks if the variable is true or false
            if (containA == false) {
                System.out.println("\nInvalid input, please try again!");

            } else {

                break; // Exits loop

            }
            
        }

        // Stage 3 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 3: Enter a string between 5 to 15 characters and does not include the letter 'z'");
            str = reader.nextLine(); // Get the string from the user

            int wordLength = str.length(); // Stores the length of the string in the variable
            boolean containZ = str.toLowerCase().contains("z"); // Checks if the string contains the letter 'z' and stores it as a boolean

            // Checks if the word length is outside of the range and if the boolean is true or false
            if (wordLength < 5 || wordLength > 15 ||  containZ == true) {

                System.out.println("\nInvalid input, please try again!");

            } else {

                break; // Exits loop

            }
            
        }

        // Stage 4 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 4: Enter an integer between 5 and 500");
            str = reader.nextLine(); // Get integer from user    
            
            // Exception 
            try {

                integer = Integer.parseInt(str);
            
            // Only accepts integers as a valid input
            } catch (NumberFormatException NumberFormatException) { 

                System.out.println("\nInvalid input, please try again!");
                continue;
                
            }

            // Checks if the integer is outside the range
            if (integer < 5 || integer > 500) {

                System.out.println("\nInvalid input, please try again!");

            } else {
                break; // Exits loop

            }
            
        }

        // Stage 5 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 5: Enter a negative integer");
            str = reader.nextLine(); // Get integer from user    
            
            // Exception
            try {

                integer = Integer.parseInt(str);
            
            // Only accepts integers as a valid input
            } catch (NumberFormatException NumberFormatException) {

                System.out.println("\nInvalid input, please try again!");
                continue;
            }

            // Checks if the number is positive or negative
            if (integer >= 0) {

                System.out.println("\nInvalid input, please try again!");

            } else {

                break; // Exits loop

            }
            
        }

        // Stage 6 Loop
        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("\nStage 6: Enter a positive odd integer");
            str = reader.nextLine(); // Get integer from user   
            
            // Exception
            try {

                integer = Integer.parseInt(str);
            
            // Only accepts integers as a valid input
            } catch (NumberFormatException NumberFormatException) {

                System.out.println("\nInvalid input, please try again!");
                continue;
                
            }

            // Checks if the number is odd or even, positive or negative
            if (integer % 2 == 0 && integer <= 0) {

                System.out.println("\nInvalid input, please try again!");

            } else {

                break; // Exits loop

            }
            
        }

        // The end after passing through all stages
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nCongratulations! You've passed through all the stages.\n");

    }
}
