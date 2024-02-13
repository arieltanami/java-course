package page19;

import java.util.Scanner;

public class page19_2 {
    // כתוב תכנית שקולטת 30 מספרים שלמים, ומדפיסה כמה מתוך המספרים האם איזוגיים
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 30;
        int count = 0;

        for (int i = 0; i < max; i++) {
            System.out.print("Enter a number: ");
            if (in.nextInt() % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of even numbers: " + count);
        in.close();
    }
}
