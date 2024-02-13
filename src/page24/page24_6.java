package page24;

public class page24_6 {
    /*
     * כתוב תכנית שמגרילה 10 ציונים בין 40-100 ומדפיסה אותם.
     * התכנית תחשב ותדפיס את ממוצע הציונים
     * x = 40 + (int)(Math.random * 61)
     */
    public static void main(String[] args) {
        int sum = 0;
        int loopLength = 10;
        int min = 40, max = 100, range = (max - min + 1);

        for (int i = 1; i <= loopLength; i++) {
            int random = min + (int) (Math.random() * range);
            System.out.print(random + " ");
            sum += random;
        }

        
        System.out.println("\n" + "Average: " + (double)sum / loopLength);
    }
}
