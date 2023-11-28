package homework.page17;

import java.util.Scanner;

public class page17_1 {
    // 1) כתוב תכנית שקולטת 3 מספרים, ומחשבת ומדפיסה כמה מהם זוגיים.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("Number of even numbers: " + evenCounter);
        System.out.println("Number of odd numbers: " + oddCounter);

        in.close();
    }
}
