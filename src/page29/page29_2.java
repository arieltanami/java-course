package page29;

import java.util.Scanner;

public class page29_2 {
    // כתוב תכנית הקולטת תווים כל עוד לא נקלט '#', ומדפיסה כמה תווים נקלטו
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        char ch;

        System.out.println("Enter characters\nEnter '#' to stop: ");

        do {
            ch = in.next().charAt(0);
            count++;
        } while (ch != '#');

        // Subtract 1 because '#' is also counted
        System.out.println("Number of characters entered: " + (count - 1));

        in.close();
    }
}