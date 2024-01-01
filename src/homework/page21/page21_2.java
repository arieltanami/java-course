package homework.page21;

import java.util.Scanner;

public class page21_2 {
    /*
     * כתוב קטע תכנית שקולט 20 מספרים
     * ומחשב ומדפיס כמה מהמספרים הם חד-ספרתיים
     * וכמה מהמספרים הם דו-ספרתיים
     */
    public static void main(String[] args) {
        int i = 0, max = 5;
        int oneDigitCount = 0, towDigitCount = 0;
        int num = 0;

        try (Scanner in = new Scanner(System.in)) {
            for (i = 1; i <= max; i++) {
                System.out.println("Enter number " + i + ":");

                num = in.nextInt();

                if (num >= 1 && num <= 9)
                    oneDigitCount++;
                if (num >= 10 && num <= 99)
                    towDigitCount++;
            }
        }

        System.out.println("One-digit numbers: " + oneDigitCount);
        System.out.println("Two-digit numbers: " + towDigitCount);
    }
}