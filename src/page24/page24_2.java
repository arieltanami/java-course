package page24;

public class page24_2 {
    // כתוב תכנית המגרילה 36 מספרים בין 5-12, וסופרת ומדפיסה כמה פעמים הוגרל המספר 8
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 36; i++) {
            int number = (int) (Math.random() * 8 + 5);
            System.out.print(number + " ");
            if (number == 8)
                count++;
        }
        System.out.println();
        System.out.println("Number 8 was drawn " + count + " times.");
    }
}
