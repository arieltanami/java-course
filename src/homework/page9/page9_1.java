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

        int num, asarot, ahadot, sum, product, reverse;
        num = asarot = ahadot = sum = product = reverse = 0;

        System.out.println("Enter a two-digit number: ");
        num = in.nextInt();
        in.close();

        asarot = num / 10;
        ahadot = num % 10;

        sum = asarot + ahadot;
        product = asarot * ahadot;
        reverse = ahadot * 10 + asarot;

        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The product of the digits is: " + product);
        System.out.println("The number with the digits in reverse order is " + reverse);
    }
}