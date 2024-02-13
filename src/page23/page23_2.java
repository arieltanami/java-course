package page23;

public class page23_2 {
    /*
     * כתוב תכנית המדמה הטלת שתי קוביות 20 פעם.
     * התכנית תדפיס כל זוג מספרים שהוגרל
     * (בלי לרדת שורה אבל עם רווח יותר גדול בין זוג לזוג)
     * ותחשב ותדפיס:
     * (א) כמה פעמים התקבל 1 , 1
     * (ב) כמה פעמים התקבל 6 , 6
     */
    public static void main(String[] args) {
        int min = 1, max = 6;

        int count11 = 0;
        int count66 = 0;

        for (int i = 0; i < 20; i++) {
            int dice1 = min + (int) (Math.random() * (max - min + 1));
            int dice2 = min + (int) (Math.random() * (max - min + 1));

            System.out.print(dice1 + "," + dice2 + "   ");

            if (dice1 == 1 && dice2 == 1)
                count11++;

            if (dice1 == 6 && dice2 == 6)
                count66++;
        }

        System.out.println();
        System.out.println("(א) כמה פעמים התקבל 1 , 1: " + count11);
        System.out.println("(ב) כמה פעמים התקבל 6 , 6: " + count66);
    }
}
