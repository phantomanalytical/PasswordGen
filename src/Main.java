import java.util.Scanner; // needed for user input
import java.lang.Math; // needed for random number generator
import java.lang.StringBuilder; // needed for string reversal

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Initializes input for Scanner

        // Begin first name input and manipulation
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine(); // puts user's first name into memory under firstName String variable
        char lastLetter = firstName.charAt(firstName.length() - 1); // Grabs last letter of first name
        char lastUpper = Character.toUpperCase(lastLetter); // Converts last letter of first name into upper case
        System.out.println(lastUpper); // Prints capitalized last letter of first name

        // Begin last name input and manipulation
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine(); // puts user's last name into memory under lastName String variable
        String firstThree = lastName.substring(0,3); // Grabs first three letters of last name
        String lowerThree = firstThree.toLowerCase(); // Sets first three letters of last name to lowercase

        // Begin random number generation between 10 and 99
        int randomNum = 10 + (int)(Math.random()*90); // Generates number between 10 and 99
        String numString = Integer.toString(randomNum); // Converts random int into string

        // Begin combination of the required components
        String initialPass = (lastUpper + numString + lowerThree); // combines all required components thus far
        System.out.println("Your initial password is: " + initialPass); // prints combined components

        // Begin concatenation of combined components and "****"
        String passConcat = initialPass.concat("****"); // Concatenates "****" onto the prior combined components
        System.out.println("Your password after using concat: " + passConcat);

        // Begin StringBuilder in order to apply reverse() method to the concatenated password
        StringBuilder str = new StringBuilder(passConcat); // Initializes StringBuilder, puts concat'd pass into "str"
        StringBuilder finalPass = str.reverse(); // Uses the StringBuilder reverse method to reverse the concat'd pass

        // Shows user the final password with all of the required manipulation applied
        System.out.println("Your final password after reversal: " + finalPass); // prints final password


    }
}