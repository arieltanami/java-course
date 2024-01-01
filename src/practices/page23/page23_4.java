package practices.page23;

public class page23_4 {
    /*
     * כתוב תכנית שמגרילה 30 מספרים אקראיים בין מינוס 100 לבין פלוס 100
     * התכנית תדפיס כל מספר שהוגרל (בלי לרדת שורה)
     * ותחשב ותדפיס כמה מהם חיוביים וכמה מהם שליליים
     */
    public static void main(String[] args) {
        int min = -100, max = 100;

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 1; i <= 5; i++) {
            int randomNumber = min + (int) (Math.random() * (max - min + 1)); // (int) (Math.random() * 201) - 100
            System.out.print(randomNumber + " ");

            if (randomNumber > 0)
                positiveCount++;
            else if (randomNumber < 0)
                negativeCount++;
        }

        System.out.println();
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        
    }
}
