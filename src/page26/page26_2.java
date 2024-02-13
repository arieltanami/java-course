package page26;

public class page26_2 {
    /*
     * הגרל והדפס מספרים אקראיים בין 1-20 כל עוד הסכום הכולל שלהם קטן מ-100
     * בסוף הדפס כמה הוגרלו ומה סכומם
     */
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int min = 1, max = 20, range = (max - min + 1);
        int num = 0;

        while (sum < 100) {
            num = min + (int) (Math.random() * range);
            System.out.print(num + " ");
            count++;
            sum += num;
        }

        System.out.println("\n" + "Total numbers drawn: " + count);
        System.out.println("Total sum: " + sum);
    }
}
