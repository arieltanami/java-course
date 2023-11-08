package homework.page9;

import java.util.Scanner;

public class page9_1 {
    /**
     * (1) כתוב תכנית שקולטת מספר דו-ספרתי. התכנית תדפיס:
     * א. סכום ספרותיו של המספר
     * ב. מכפלת ספרותיו של המספר
     * ג. ספרותיו של המספר לפי סדר הפוך
     * לדוגמא: אם נקלט המספר 47, יודפס: סכום 11 מכפלה 28 היפוך 74
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, asarot, ahadot;
        // Prompt the user to enter a two-digit number
        System.out.println("Enter a two-digit number: ");
        num = in.nextInt();

        // Calculate the tens and units of the first number
        asarot = num / 10;
        ahadot = num % 10;

        // Print the sum of the digits
        System.out.println("The sum of the digits is: " + (asarot + ahadot));

        // Print the product of the digits
        System.out.println("The product of the digits is: " + asarot * ahadot);

        // Print the number with the digits in reverse order
        System.out.println("The number with the digits in reverse order is " + ahadot + asarot);
    }
}