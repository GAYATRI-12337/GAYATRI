import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");

        // Read the user's input as a string
        String userName = scanner.nextLine();

        // Display the greeting message
        System.out.println("Hello, " + userName + "!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
