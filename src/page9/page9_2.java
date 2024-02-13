package page9;

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

        int num, meot, asarot, ahadot, sum, product, reverse;
        num = meot = asarot = ahadot = sum = product = reverse = 0;

        System.out.println("Enter a three-digit number: ");
        num = in.nextInt();
        in.close();

        meot = num / 100;
        asarot = (num / 10) % 10;
        ahadot = num % 10;

        sum = meot + asarot + ahadot;
        product = meot * asarot * ahadot;
        reverse = ahadot * 100 + asarot * 10 + meot;

        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The product of the digits is: " + product);
        System.out.println("The number with the digits in reverse order is: " + reverse);
    }
}