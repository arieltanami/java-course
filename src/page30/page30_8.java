package page30;

import java.util.Scanner;

/**
 * כתוב תכנית שתקלוט מספרים תלת-ספרתיים, ולכל מספר תחשב ותדפיס את סכום ספרותיו
 * התכנית תסתיים כאשר ייקלט המספר 99
 */
public class page30_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter three-digit numbers\nEnter '99' to stop: ");

        do {
            num = in.nextInt();
            if (num != 99) {
                int sum = num / 100 + (num % 100) / 10 + (num % 10);
                System.out.println("The sum of the digits of " + num + " is " + sum);
            }
        } while (num != 99);

        in.close();
    }
}