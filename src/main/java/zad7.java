public class zad7 {
    /*
    7. Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy
    są poprawnie sparowane. Wyrażenie podawane jest jako pojedynczy łańcuch znaków. Program powinien
    wyświetlić stosowny komunikat.
     */

    public static void main(String[] args) {
        String dzialanie = "2 * (3.4 - (-7)/2)*(a-2)/)b-1(";
        System.out.println(dzialanie);

        String noweDzialanie = dzialanie.trim().replace(" ", "");
        System.out.println(noweDzialanie);
        char [] znaki = noweDzialanie.toCharArray();

        char nawiasOtwarcie = '(';
        char nawiasZamkniecie= ')';

        int licznikOtwartych = 0;
        int licznikZamknietych = 0;
        int indeksOtwartych =0;
        int indeksZamknietych = 0;


        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == nawiasOtwarcie) {
                indeksOtwartych=i;
                licznikOtwartych++;
            }
            else if (znaki[i]==nawiasZamkniecie){
                indeksZamknietych=i;
                licznikZamknietych++;
            }


        }
        if (licznikOtwartych!=licznikZamknietych) {
            System.out.println("Otwarte: " + licznikOtwartych);
            System.out.println("Zamknięte: "+ licznikZamknietych);
            System.out.println("Błędne sparowanie nawiasów");
        }
        if (indeksZamknietych<indeksOtwartych) {
            System.out.println("Błędna kolejność nawiasów");
        }
    }
}
