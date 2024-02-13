package page17;

public class page17_3 {
    // כתוב תכנית שמחשבת ומדפיסה כמה מספרים בין 200-600 מתחלקים ב-7 ללא שארית.
    public static void main(String[] args) {
        int count = 0;
        for (int i = 200; i < 600; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers divisible by 7 between 200 and 600: " + count);
    }
}
