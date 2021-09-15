
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int vika = Integer.valueOf(lukija.nextLine());
        int kertoma = 1;
        if (vika==0) {
            System.out.println("Kertoma on " + kertoma);
        } else {
            for (int i=1; i<=vika; i++) {
                kertoma = kertoma * i;
            }
            System.out.println("Kertoma on " + kertoma);
        }
    }
}
