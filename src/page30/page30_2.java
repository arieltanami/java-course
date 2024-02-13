package page30;

import java.util.Scanner;

/**
 * מנמל אשדוד מפליגות אניות לחו"ל הנושאות ארגזי תפוזים.
 * כתוב תכנית הקולטת עבור כל אניה, את מספר הארגזים שהוטענו עליה,
 * ומחשבת ומדפיסה את סך-כל הארגזים שנשלחו לחו"ל
 * 
 * הקלט יסתיים כאשר יוכנס מספר ארגזים
 * 77-
 */
public class page30_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalBoxes = 0;
        int boxes;

        System.out.println("Enter the number of boxes loaded on each ship.\nEnter '-77' to stop: ");

        do {
            boxes = in.nextInt();
            if (boxes != -77) {
                totalBoxes += boxes;
            }
        } while (boxes != -77);

        System.out.println("Total boxes sent abroad: " + totalBoxes);

        in.close();
    }
}