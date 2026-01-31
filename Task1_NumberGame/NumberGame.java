import java.util.Random;
 import java.util.Scanner;
 public class NumberGame {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
         boolean playAgain = true;
         System.out.println("WELCOME TO NUMBER GUESSING GAME");
         while (playAgain) {
             int number = random.nextInt(100) + 1;
             int guess = 0;
             int attempts = 0;
             int maxAttempts = 5;
             System.out.println("\nI have chosen a number between 1 and 100.");
             System.out.println("You have " + maxAttempts + "attempts.");
             while (guess != number && attempts < maxAttempts) {
               System.out.println("Enter your guess:");
               guess = sc.nextInt();
               attempts++;
               if (guess > number) {
               System.out.println("Too high");
               } else if (guess < number) {
               System.out.println("Too low");
               } else {
               System.out.println("correct! you guessed it in " + attempts + "attempts.");
            totalScore += (maxAttempts - attempts + 1) * 10;
          }
        } 
        if (guess != number) {
         System.out.println("You have used all attempts.");
         System.out.println("The correct number was: " + number); 
       
    }
    System.out.println("your current score: " + totalScore);
    System.out.println("Do you want to play again? (yes/no): ");
    String choice = sc.next();
    if(!choice.equalsIgnoreCase("yes")) {
        playAgain = false;
     }
    }
    System.out.println("\n Game Over!");
    System.out.println("Final Score: " + totalScore);
    sc.close();
   }
  }