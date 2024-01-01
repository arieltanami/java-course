package practices.page23;

public class page23_1 {
    /*
     * כתוב תכנית המדמה הטלת קוביה 100 פעם
     * התכנית תדפיס כל מספר שהוגרל
     * (בלי לרדת שורה אבל עם רווח קטן בין מספר למספר)
     * ותחשב ותדפיס:
     * (א) כמה פעמים התקבל 5
     * (ב) כמה פעמים התקבל מספר קטן מ-3
     * (ג) כמה פעמים התקבל מספר זוגי
     */
    public static void main(String[] args) {
        int min = 1, max = 6;

        int count5 = 0;
        int countLessThan3 = 0;
        int countEven = 0;

        for (int i = 1; i <= 100; i++) {
            int rnd = min + (int) (Math.random() * (max - min + 1));
            System.out.print(rnd + " ");

            if (rnd == 5)
                count5++;

            if (rnd < 3)
                countLessThan3++;

            if (rnd % 2 == 0)
                countEven++;
        }

        System.out.println();
        System.out.println("Number of times 5 was rolled: " + count5);
        System.out.println("Number of times a number less than 3 was rolled: " + countLessThan3);
        System.out.println("Number of times an even number was rolled: " + countEven);
    }
}
