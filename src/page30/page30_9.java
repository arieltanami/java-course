package page30;

import java.util.Scanner;

/**
 * כתוב תכנית שתקלוט מספרים דו-ספרתיים, ותחשב ותדפיס את סכום המספרים שנקלטו
 * המתחלקים ב-10 ללא שארית. התכנית תסתיים כאשר ייקלט המספר 100
 */
public class page30_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter two-digit numbers\nEnter '100' to stop: ");

        do {
            number = in.nextInt();
            if (number != 100 && number % 10 == 0) {
                sum += number;
            }
        } while (number != 100);

        System.out.println("The sum of the numbers divisible by 10 is " + sum);

        in.close();
    }
}