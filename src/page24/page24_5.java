package page24;

public class page24_5 {
    /*
     * כתוב תכנית שמגרילה 10 מספרים שלמים, בתחום [-10,10], ומדפיסה אותם. התכנית תחשב
     * ותדפיס את סכום המספרים החיוביים, את סכום המספרים השליליים
     * את מספר המספרים החיוביים, ואת מספר השליליים,
     * x = -10 + (int)(Math.random * 21)
     */
    public static void main(String[] args) {
        int positiveSum = 0;
        int negativeSum = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        int loopLength = 10;
        int min = -10, max = 10, range = (max - min + 1);

        for (int i = 1; i <= loopLength; i++) {
            int random = min + (int) (Math.random() * range);
            System.out.println(random);

            if (random > 0) {
                positiveSum += random;
                positiveCount++;
            } else if (random < 0) {
                negativeSum += random;
                negativeCount++;
            }
        }

        System.out.println("Positive sum: " + positiveSum);
        System.out.println("Negative sum: " + negativeSum);
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
    }
}
