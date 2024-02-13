package page15;

public class page15_6 {
    // (6) כתוב תכנית שעוברת על כל המספרים בין 1-100
    // ומדפיסה כל מספר שמתחלק ב-11 ללא שארית
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }
    }
}