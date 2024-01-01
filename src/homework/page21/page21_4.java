package homework.page21;


public class page21_4 {
/*
 * כתוב קטע תכנית שעובר על כל המספרים התלת-ספרתיים
 * ומחשב ומדפיס בכמה מהמספרים ספרת האחדות שווה לספרת המאות
 * (המספר 282 מקיים את התנאי)
 */
    public static void main(String[] args) {
        int count = 0;
        
        for (int number = 100; number <= 999; number++) {
            int ones = number % 10;
            int hundreds = number / 100;
            
            if (ones == hundreds) {
                count++;
            }
        }
        
        System.out.println("Number of three-digit numbers where ones digit equals hundreds digit: " + count);
    }

}