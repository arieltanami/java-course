package page30;

import java.util.Scanner;

/**
 * חברי מועדון טניס יכולים לרכוש כרטיסים לאחד משני משחקים שונים
 * למשחק הראשון ניתן קוד 1, ולמשחק השני - קוד 2
 * כתוב תכנית שתקלוט עבור כל חבר מועדון את קוד המשחק שבחר ואת מספר הכרטיסים שהוא
 * רוצה להזמין למשחק
 * 
 * התכנית תחשב ותדפיס את מספר הכרטיסים שהוזמנו לכל אחד משני המשחקים
 * התכנית תסתיים כאשר ייקלט קוד משחק 0
 */
public class page30_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gameCode = 0;
        int tickets = 0;
        int game1Tickets = 0;
        int game2Tickets = 0;

        System.out.println("Enter the game code and the number of tickets you want to order.\nEnter '0' to stop: ");

        do {
            gameCode = in.nextInt();
            if (gameCode != 0) {
                tickets = in.nextInt();
                if (gameCode == 1) {
                    game1Tickets += tickets;
                } else if (gameCode == 2) {
                    game2Tickets += tickets;
                }
            }
        } while (gameCode != 0);

        System.out.println("Number of tickets ordered for game 1: " + game1Tickets);
        System.out.println("Number of tickets ordered for game 2: " + game2Tickets);

        in.close();
    }
}