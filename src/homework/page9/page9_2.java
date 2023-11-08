package homework.page9;

import java.util.Scanner;

public class page9_2 {
    /**
     * (2) כתוב תכנית שקולטת מספר תלת-ספרתי. התכנית תדפיס
     * א. סכום ספרותיו של המספר
     * ב. מכפלת ספרותיו של המספר
     * ג. ספרותיו של המספר לפי סדר הפוך
     * לדוגמא: אם נקלט המספר 247, יודפס: סכום 13 מכפלה 56 היפוך 742
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, meot, asarot, ahadot;
        // Prompt the user to enter a three-digit number
        System.out.println("Enter a three-digit number: ");
        num = in.nextInt();

        // Store each digit in a separate variable
        meot = num / 100;
        asarot = (num / 10) % 10;
        ahadot = num % 10;

        // Print the sum of the digits
        System.out.println("The sum of the digits is: " + (meot + asarot + ahadot));

        // Print the product of the digits
        System.out.println("The product of the digits is: " + meot * asarot * ahadot);

        // Print the number with the digits in reverse order
        System.out.println("The number with the digits in reverse order is: " + ahadot + asarot + meot);
    }
}