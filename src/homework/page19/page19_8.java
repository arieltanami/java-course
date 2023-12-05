package homework.page19;

public class page19_8 {
    /*
     * כתוב תכנית שמחשבת ומדפיסה:
     * א) סכום כל המספרים הדו-ספרתיים המתחלקים ב- 9.
     * ב) כמה מספרים דו-ספרתיים מתחלקים ב- 9.
     */
    public static void main(String[] args) {
        int count = 0, sum = 0;

        for (int i = 18; i <= 99; i += 9) {
            count++;
            sum += i;
        }
        
        System.out.println("Sum of all two-digit numbers that are divisible by 9: " + sum);
        System.out.println("Number of two-digit numbers that are divisible by 9: " + count);
    }
}
