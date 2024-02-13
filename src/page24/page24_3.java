package page24;

public class page24_3 {
    /*
     * כתוב תכנית המגרילה 27 מספרים בין 1-99,
     * ומדפיסה "יותר חד-ספרתיים" אם הוגרלו יותר מספרים חד-ספרתיים
     * ואחרת מדפיסה "יותר דו-ספרתיים" אם הוגרלו יותר מספרים דו-ספרתיים
     * 
     * ב. מה צריך לשנות אם מספר המספרים שהוגרלו הוא 28?
     */
    public static void main(String[] args) {
        int hadSifratiCount = 0;
        int duSifratiCount = 0;
        int loopLength = 27;

        int min = 1, max = 20, range = (max - min + 1);

        for (int i = 1; i <= loopLength; i++) {
            int rnd = min + (int) (Math.random() * range);
            System.out.print(rnd + " ");
            if (rnd > 0 && rnd < 10)
                hadSifratiCount++;
            if (rnd > 9 && rnd < 100)
                duSifratiCount++;
        }
        System.out.println();

        if (hadSifratiCount > duSifratiCount)
            System.out.println("More single digits");
        else
            System.out.println("More double digits");
    }
}