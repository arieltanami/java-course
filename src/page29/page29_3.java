package page29;

import java.util.Scanner;

public class page29_3 {
    // כתוב תכנית הקולטת שמות כל עוד לא נקלט "zerubavel", ומדפיסה כמה שמות נקלטו.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String name;

        System.out.println("Enter names,/Enter 'zerubavel' to stop: ");

        do {
            name = in.nextLine();
            count++;
        } while (!name.equals("zerubavel"));

        // Subtract 1 because 'zerubavel' is also counted
        System.out.println("Number of names entered: " + (--count));

        in.close();
    }
}
