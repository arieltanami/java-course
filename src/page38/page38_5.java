package page38;

/**
 * כתוב תכנית שמציבה מספרים אקראיים בתחום 1-10 במקומות עם
 * אינדקסים זוגיים של מערך באורך 20, ובמקומות עם אינדקסים איזוגיים
 * מציבה את הערך השלילי של אותו מספר שמופיע לפניו
 * הדפס את המערך בשורה אחת.
 * דוגמא:
 * 7 -7 3 -3 8 -8 . . .
 */
public class page38_5 {

    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        int min = 1, max = 10, range = (max - min + 1);

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0)
                arr[i] = min + (int) (Math.random() * range);
            else
                arr[i] = -arr[i - 1];
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}