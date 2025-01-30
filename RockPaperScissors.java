import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        String userChoice;
        String computerChoice;
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            userChoice = scanner.nextLine().trim();

            
            while (!userChoice.equalsIgnoreCase("Rock") && 
                   !userChoice.equalsIgnoreCase("Paper") && 
                   !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid choice. Please enter Rock, Paper, or Scissors: ");
                userChoice = scanner.nextLine().trim();
            }

            
            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer chose: " + computerChoice);

            
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}