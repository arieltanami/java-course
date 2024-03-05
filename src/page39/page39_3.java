
package page39;

public class page39_3 {
    /*
     * נתון מערך חד-ממדי בגודל 28, המכיל מספרים שלמים בין 1 ל-99 (כולל)
     * כתוב קטע תכנית שידפיס "דו-ספרתיים"
     * אם במערך יש יותר מספרים דו-ספרתיים ממספרים
     * חד-ספרתיים. אחרת, קטע תכנית שידפיס "חד-ספרתיים"
     * 
     * Given an array of integers (1-99) and prints "double-digit" if
     * there are more double-digit numbers than single-digit numbers, otherwise it
     * prints "single-digit".
     */
    public static void main(String[] args) {

        int size = 28;
        int[] arr = new int[size];
        int twoDigit = 0, oneDigit = 0;

        // Fill the array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
        }

        // Count the number of two digit numbers and one digit numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] > 9) {
                twoDigit++;
            } else {
                oneDigit++;
            }
        }

        if (twoDigit > oneDigit) {
            System.out.println("דו-ספרתיים");
        } else {
            System.out.println("חד-ספרתיים");
        }
    }
}
