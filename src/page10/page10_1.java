package page10;

import java.util.Scanner;

public class page10_1 {
    /**
     * (א) כתוב תכנית שקולטת מספר דו-ספרתי, ומדפיסה האם ספרת העשרות גדולה מספרת
     * האחדות, או לא.
     * דוגמא לקלט: 85 הפלט: כן
     * דוגמא לקלט: 34 הפלט: לא
     * (ב) שנה את התכנית כך שתבדוק האם ספרת העשרות גדולה ב-2 (בדיוק) מספרת האחדות,
     * או לא. דוגמא לקלט: 86 הפלט: כן
     * דוגמא לקלט: 94 הפלט: לא
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a two-digit number: ");
        int num = in.nextInt();
        in.close();

        int asarot = num / 10;
        int ahadot = num % 10;

        // (א)
        if (asarot > ahadot) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // (ב)
        if (asarot == ahadot + 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}