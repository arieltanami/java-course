package page17;

public class page17_5 {
    /*
     * כתוב תכנית שעוברת על כל המספרים התלת-ספרתיים, ומחשבת ומדפיסה בכמה מהם
     * מופיעה הספרה 4.
     */
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int meot = i / 100;
            int asarot = (i / 10) % 10;
            int ahadot = i % 10;

            if (meot == 4 || asarot == 4 || ahadot == 4) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("Total numbers with digit 4: " + count);
    }
}
