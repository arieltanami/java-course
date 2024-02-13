package page17;

import java.util.Scanner;

public class page17_2 {
    // כתוב תכנית שקולטת 10 מספרים, ומחשבת ומדפיסה כמה מהם חיוביים, וכמה מהם שליליים
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            int number = in.nextInt();

            if (number > 0) {
                positiveCounter++;
            } else if (number < 0) {
                negativeCounter++;
            }
        }

        System.out.println("Positive numbers: " + positiveCounter);
        System.out.println("Negative numbers: " + negativeCounter);

        in.close();
    }
}
