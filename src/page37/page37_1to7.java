package page37;

/**
 * כתוב תכנית שיוצרת מערך חד-ממדי a
 * באורך 20 ע"י הגרלת מספרים בין 1-50
 * ומבצעת את הדברים הבאים:
 * 
 * 1. הדפסת כל איברי המערך בשורה אחת, ומתחת לאיברי המערך
 * הדפסת המקומות הסידוריים של איברי המערך
 * 
 * 2. הדפסת כל האיברים במקומות הזוגיים
 * 
 * 3. הדפסת כל האיברים שהתוכן שלהם זוגי
 * 
 * 4. הדפסת המקומות של כל האיברים השווים לאיבר לפני האחרון
 * 
 * 5. הדפסת כל האיברים הגדולים מהאיבר הקודם להם
 * 
 * 6. הדפסת הסכום של כל זוג איברים עוקבים
 * 
 * 7. הדפסת המכפלה של כל זוג איברים עוקבים
 * 
 * הערה: בין קטע לקטע יש לעבור שורה ע"י
 * System.out.println( )
 * כדי שקטע חדש לא יודפס בהמשכו של השורה הקודמת
 * מעל כל קטע רצוי להדפיס כותרת המסבירה מה הקטע מבצע
 */
public class page37_1to7 {

    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        int min = 1, max = 20, range = (max - min + 1);

        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 1");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");

        System.out.println("array and the indices:");
        for (int i = 0; i < size; i++) {
            arr[i] = min + (int) (Math.random() * range);
            System.out.printf("%-3d", arr[i]);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("%-3d", i);
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 2");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");

        System.out.println("Elements at even indices:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 3");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");
        System.out.println("Elements with even values:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 4");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");
        System.out.println("Indexes of elements equal to the value of the one before last element:");
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[size - 2] && i != size - 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 5");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");
        System.out.println("Elements greater than the previous element:");
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 6");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");
        System.out.println("Consecutive elements:");
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                System.out.print(arr[i - 1] + "," + arr[i] + "  ");
            }
        }
        System.out.println("\nSum of all consecutive elements:");
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                System.out.print(arr[i] + arr[i - 1] + " ");
            }
        }

        System.out.println("\n\n~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~");
        System.out.println("                 part 7");
        System.out.println("~~~~~~~~~~ ~~~~~~~~  ~~~~~~~~ ~~~~~~~~~~\n");
        System.out.println("Product of all consecutive elements:");
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                System.out.print(arr[i] * arr[i - 1] + " ");
            }
        }
    }
}