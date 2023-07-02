import java.util.Scanner;
import java.util.Random;

class Number_guess {
    public static void main(String args[]) {
        int start_range = 1;
        int stop_range = 100;
        int attempts = 5;
        int score = 0;

        Random rn = new Random();
        int rand_num = rn.nextInt(stop_range - start_range + 1) - start_range;

        Scanner sc = new Scanner(System.in);
        System.out.println("GUESS THE NUMBER GAME!");
        System.out.println("Guess a number between " + start_range + " and " + stop_range);
        System.out.println("Number of attempts :- " + attempts);

        while (attempts > 0) {
            System.out.println("Guess a number:- ");
            int guess = sc.nextInt();
            if (guess == rand_num) {
                System.out.println("Great! Correct number guessed!");
                score = score + (attempts * 10);
                break;
            } else if (guess < rand_num) {
                System.out.println("Try again! The number is higher!");
            } else {
                System.out.println("Try again! The number is lower!");
            }
            attempts--;

            if (attempts > 0) {
                System.out.println("Attempts left :- " + attempts);
            } else {
                System.out.println("GAME OVER! The number was :- " + rand_num);
            }
        }

        System.out.println("SCORE :- " + score);
    }
}