import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        // Ask the user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = in.nextInt();
        // Check if the input is in the range 1 to 12
        if (birthMonth >= 1 && birthMonth <= 12) {
            //Print user's input if valid
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // If not valid, output an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

    }
}