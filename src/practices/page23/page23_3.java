package practices.page23;

public class page23_3 {
    /*
     * כתוב תכנית שמגרילה 30 מספרים אקראיים דו-ספרתיים
     * התכנית תדפיס כל מספר שהוגרל (בלי לרדת שורה)
     * ותחשב ותדפיס בכמה מהם ספרת העשרות גדולה מספרת האחדות
     */
    public static void main(String[] args) {
        int min = 10, max = 99;

        int count = 0;
        int ahadot = 0, asarot = 0;

        for (int i = 0; i < 5; i++) {
            int rnd = min + (int) (Math.random() * (max - min + 1)); // (Math.random() * 90) + 10
            System.out.print(rnd + " ");

            ahadot = rnd % 10;
            asarot = (rnd / 10) % 10;

            if (asarot > ahadot)
                count++;
        }

        System.out.println();
        System.out.println("Number of times the tens digit was greater than the ones digit: " + count);
    }
}