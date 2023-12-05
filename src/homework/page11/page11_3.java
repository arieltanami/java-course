package homework.page11;

import java.util.Scanner;

public class page11_3 {
    /**
     * החלפת תאים
     * 
     * a ו-b קלוט שני מספרים
     * a-סדר את המספרים כך שהקטן מביניהם יהיה ב
     * b-והגדול מביניהם יהיה ב
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = in.nextInt(); // 10
        int b = in.nextInt(); // 20
        in.close();

        if (a > b) {
            a = a + b; // 10+20=30
            b = a - b; // 30-20=10
            a = a - b; // 30-10=20
        }

        System.out.println("The smaller number is: " + a);
        System.out.println("The larger number is: " + b);
    }
}