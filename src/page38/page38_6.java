package page38;

/**
 * כתוב תכנית שמציבה מספרים אקראיים שהם כפולות 3 בתחום 3-30
 * במקומות עם אינדקסים זוגיים של מערך באורך 20,
 * ובמקומות עם אינדקסים איזוגיים - מציבה מספרים אקראיים שליליים
 * שהם כפולות 2 בתחום [-20, -2]
 * הדפס את המערך בשורה אחת
 * דוגמא:
 * 9 -14 24 -6 15 -4 . . .
 */
public class page38_6 {

    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        int min = 1, max = 10, range = (max - min + 1);

        for (int i = 0; i < size; i++)
            arr[i] = (i % 2 == 0) ? (min + (int) (Math.random() * range)) * 3
                    : (min + (int) (Math.random() * range)) * -2;

        // Print the array in one line
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}