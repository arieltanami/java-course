package page24;

import java.util.Scanner;

public class page24_1 {
    /*
     * כתוב תכנית המגרילה מספר בין 1-30
     * יש לך 3 ניחושים לנחש את המספר
     * אם ניחשת נכון בניחוש הראשון, יודפס הודעה: זכית ב100₪
     * אם ניחשת נכון בניחוש השני, יודפס הודעה: זכית ב50₪
     * אם ניחשת נכון בניחוש השלישי, יודפס הודעה: זכית ב25₪
     * בכל מקרה אחר יודפס: לא זכית הפעם
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 30) + 1;
        int attempts = 3;

        System.out.println("Welcome to the guessing game!");
        System.out.println("You have 3 attempts to guess a number between 1 and 30.");

        System.out.println(secretNumber);
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = in.nextInt();

            if (guess == secretNumber) {
                if (i == 1)
                    System.out.println("Congratulations! You won 100 ₪.");
                else if (i == 2)
                    System.out.println("Congratulations! You won 50 ₪.");
                else if (i == 3)
                    System.out.println("Congratulations! You won 25 ₪.");
                return;
            }
        }

        System.out.println("Sorry, you didn't win this time. The secret number was: " + secretNumber);
    }
}
