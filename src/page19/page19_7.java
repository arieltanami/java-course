package page19;

public class page19_7 {
    /*
     * כתוב תכנית שמחשבת ומדפיסה:
     * א) כמה מספרים בין 150-500 מכילים את הספרה 5 (לפחות פעם אחת).
     * ב) מה הסכום הכולל של כל המספרים בין 150-500 המכילים את הספרה 5.
     */
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int digit = 5;
        int num = 0;
        int meot, asarot, ahadot;

        for (int i = 150; i <= 500; i++) {
            num = i;

            ahadot = num % 10;
            asarot = (num / 10) % 10;
            meot = num / 100;

            if (ahadot == digit || asarot == digit || meot == digit) {
                count++;
                sum += num;
            }
        }

        System.out.println("Number of numbers between 150-500 that contain the digit 5: " + count);
        System.out.println("Sum of all numbers between 150-500 that contain the digit 5: " + sum);
    }
}
