package homework.page21;

import java.util.Scanner;

public class page21_3 {
    /*
     * כתוב קטע תכנית שקולטת 10 מספרים תלת-ספרתיים
     * ומחשבת ומדפיסה בכמה מהמספרים ספרת האחדות שווה לספרת המאות
     * (המספר 282 מקיים את התנאי)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0, count = 0;
        int ahadot = 0, meot = 0;
        int i = 0, loopLength = 10;

        try {
            System.out.println("Enter " + loopLength + " three-digit numbers:");
            for (i = 1; i <= loopLength; i++) {
                num = in.nextInt();
                ahadot = num % 10;
                meot = num / 100;

                if (ahadot == meot) {
                    count++;
                }
            }
        } finally {
            in.close();
        }

        System.out.println("Number of three-digit numbers where ones digit equals hundreds digit: " + count);
    }

}