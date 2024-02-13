package page26;

public class page26_1 {
    // הגרל והדפס מספרים אקראיים בין 1-20 כל עוד עדיין לא הוגרל 13 בסוף הדפס כמה
    // הוגרלו
    public static void main(String[] args) {
        int count = 0;
        int min = 1, max = 20, range = (max - min + 1);
        int num = 0;

        while (num != 13) {
            num = min + (int) (Math.random() * range);
            System.out.print(num + " ");
            count++;
        }

        System.out.println("\n" + "Total numbers drawn: " + count);
    }
}
