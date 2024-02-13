package page26;

public class page26_3 {
    /*
     * הגרל והדפס מספרים אקראיים בין 1-20 כל עוד עדיין לא הוגרלו 7 מספרים הגדולים
     * מ-10. בסוף הדפס כמה הוגרלו
     */
    public static void main(String[] args) {
        int count = 0;
        int greaterThanTenCount = 0;
        int min = 1, max = 20, range = (max - min + 1);
        int num = 0;

        while (greaterThanTenCount < 7) {
            num = min + (int) (Math.random() * range);
            System.out.print(num + " ");
            count++;

            if (num > 10) {
                greaterThanTenCount++;
            }
        }

        System.out.println("\n" + "Total numbers drawn: " + count);
    }
}
