import java.util.Scanner;

public class Main {

    public static final String WIDTHTEXT = "Kérem a téglalap szélességét: ";
    public static final String HEIGHTTEXT = "Kérem a téglalap magasságát: ";
    public static final String CHARACTERTEXT = "Kérem a rajzoló karaktert: ";

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // kérjen be a felhasználótól adatokat (a téglalap szélessége és magassága), a megjelenítendő karakter, és razoljon ki egy ilyen méretű téglalapot a megadott karakterből

        int width = getUserInputNumber(WIDTHTEXT, scanner);
        int height = getUserInputNumber(HEIGHTTEXT, scanner);
        String character = getUserInputText(CHARACTERTEXT, scanner);
        drawRectangle(width, height, character);
    }

    public static int getUserInputNumber(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String getUserInputText(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.next();
    }

    public static void drawRectangle(int width, int hight, String character) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}