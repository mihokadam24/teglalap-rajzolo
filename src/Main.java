import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // kérjen be a felhasználótól adatokat (a téglalap szélessége és magassága), a megjelenítendő karakter, és razoljon ki egy ilyen méretű téglalapot a megadott karakterből

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a téglalap szélességét: ");
        int szelesseg = scanner.nextInt();
        System.out.print("Kérem a téglalap magasságát: ");
        int magassag = scanner.nextInt();
        System.out.print("Kérem a rajzoló karaktert: ");
        String character = scanner.next();
        // kirajzolás
        for (int i = 0; i < magassag; i++) {
            for (int j = 0; j < szelesseg; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }

    }
}