package homework.page17;

import java.util.Scanner;

public class page17_6 {
    /*
     * כתוב תכנית שקולטת סכומי כסף הנתרם לצדקה ע"י 10 אנשים. כמה מבין התורמים תרמו
     * 100 ש"ח או יותר.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalDonors = 3;
        int count = 0;

        for (int i = 1; i <= totalDonors; i++) {
            System.out.print("Enter the donation amount for donor " + i + ": ");
            int donationAmount = in.nextInt();

            if (donationAmount >= 100) {
                count++;
            }
        }
        in.close();
        System.out.println("Number of donors who donated 100 shekels or more: " + count);
    }
}
