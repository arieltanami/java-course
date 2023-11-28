package homework.page12;

import java.util.Scanner;

public class page12_1 {
    /* שעשוע 2023 (2017 לשעבר)
     * 
     * א) עקוב אחרי התהליך הבא:
     * • קלוט מספר בין 2-9
     * • הכפל את המספר ב-2
     * • הוסף למספר 5
     * • הכפל את המספר ב-50
     * • בדוק האם כבר חגגת השנה את יום הולדתך או לא
     * (הצג שאלה וקלוט 1 או 0)
     * 1 - מייצג שכבר חגגת
     * 0 - מייצג שעוד לא חגגת
     * אם כבר חגגת - הוסף 1772
     * ואם לא - הוסף 1771
     * • קלוט את שנת לידתך (4 ספרות), והחסר אותה מהמספר
     * • קבלת מספר תלת-ספרתי
     * הפרד את התוצאה לשני מספרים: ספרת מאות, ושתי הספרות
     * הימניות
     * ספרת המאות היא המספר המקורי שבחרת, ושתי הספרות הימניות הן גילך
     * ב) כתוב תכנית לביצוע התהליך הנ"ל.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a one-digit number: ");
        int num = in.nextInt();

        num *= 2;
        num += 5;
        num *= 50;

        // קבל מהמשתמש אם כבר חגג השנה יומולדת (0 או 1)
        System.out.print("Enter 1 if you have celebrated your birthday this year, or 0 if not: ");
        num += 1772 + in.nextInt();

        // קבל את שנת הלידה של המשתמש
        System.out.print("Enter your year of birth (four-digit number): ");
        num -= in.nextInt();

        int meot = num / 100, towLastDigits = num % 100;
        System.out.println("You are " + towLastDigits + " years old. The number you're choosed is " + meot + ".");
    }
}
