package page30;

import java.util.Scanner;

/**
 * כלי רכב שגובהם קטן מ-5.10 מ' יכולים לעבור מתחת לגשר.
 * כתוב תכנית שתקלוט עבור כל כלי רכב שמתקרב לגשר את גובהו
 * התכנית תספור ותדפיס כמה כלי רכב עברו מתחת לגשר,
 * וכמה כלי רכב הופנו לכביש עוקף
 * התכנית תסתיים כאשר ייקלט גובה 9
 */
public class page30_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = 0.0;
        int passed = 0;
        int diverted = 0;

        System.out.println("Enter the height of each vehicle approaching the bridge\nEnter '9' to stop: ");

        do {
            height = in.nextDouble();
            if (height < 5.10 && height != 9) {
                passed++;
            } else if (height >= 5.10 && height != 9) {
                diverted++;
            }
        } while (height != 9);

        System.out.println("Number of vehicles that passed under the bridge: " + passed);
        System.out.println("Number of vehicles that were diverted to a bypass: " + diverted);

        in.close();
    }
}