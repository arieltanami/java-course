package lessons.page_7;

import java.util.Scanner;

public class page7_1 {
    /**
     * Calculate and print the hundreds, tens and units
     * of a (two-digit and) three-digit nums
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ahadot = 0, asarot = 0, ahadot1 = 0, asarot1 = 0,
                meot1 = 0, du = 0, tlat = 0;

        System.out.println("Enter x (du־sifrati): ");
        du = in.nextInt();

        asarot = du / 10;
        ahadot = du % 10;

        System.out.println("asarot = " + asarot);
        System.out.println("ahadot = " + ahadot);

        System.out.println("Enter x1 (tlat sifrati): ");
        tlat = in.nextInt();

        meot1 = tlat / 100;
        asarot1 = tlat / 10 % 10;
        ahadot1 = tlat % 10;

        System.out.println("meot1 = " + meot1);
        System.out.println("asarot1 = " + asarot1);
        System.out.println("ahadot1 = " + ahadot1);
    }
}
