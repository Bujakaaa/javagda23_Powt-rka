import java.util.Scanner;

public class Zad5 {
    /*
    5. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla informację o tym
    ile razy w tym ciągu powtarza się jego ostatni znak.
Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ ostatnim znakiem jest literka „a”,
która występuje w podanym ciągu łącznie 4 razy.
     */

    public static void main(String[] args) {

        String tekst = "Abrakadabra";
        String nowy = tekst.trim().toLowerCase();
        System.out.println(nowy);

        char [] znaki = nowy.toCharArray();
        char ostatniZnak = znaki[znaki.length-1];
        System.out.println(ostatniZnak);

        int licznik = 0;
        for (char z: znaki) {
            if (z == ostatniZnak) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }
}
