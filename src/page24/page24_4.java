package page24;

public class page24_4 {
    /*
     * כתוב תכנית שמגרילה 10 מספרים שלמים בתחום 1-50, ומדפיסה אותם
     * התכנית תחשב ותדפיס את סכום המספרים הזוגיים, את סכום המספרים האיזוגיים,
     * את מספר המספרים הזוגיים, ואת מספר האיזוגיים
     * x = 1 + (int)(Math.random * 50)
     */
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int min = 1, max = 50, range = (max - min + 1);

        int loopLength = 10;

        for (int i = 1; i <= loopLength; i++) {
            int rnd = 1 + (int) (Math.random() * range);
            System.out.print(rnd + " ");

            if (rnd % 2 == 0) {
                evenSum += rnd;
                evenCount++;
            } else {
                oddSum += rnd;
                oddCount++;
            }
        }

        System.out.println();
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
