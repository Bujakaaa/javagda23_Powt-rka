import java.util.Scanner;

public class Zad6 {
    /*
    6. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
     łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie. Przykładowo,
     dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String slowo = scanner.nextLine();

        char [] znaki = slowo.toCharArray();
        String nowy = "";

        for (int i = znaki.length-1; i>=0  ; i--) {
            nowy += slowo.charAt(i);

        }
        System.out.println(nowy);
    }
}
