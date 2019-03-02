public class Zad7JeszczeRaz {
       /*
    7. Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy
    są poprawnie sparowane. Wyrażenie podawane jest jako pojedynczy łańcuch znaków. Program powinien
    wyświetlić stosowny komunikat.
     */

    public static void main(String[] args) {
        String dzialanie = "(2 * (3.4 - (-7)/2)*(a-2)/)b-1()";
        String noweDzialanie = dzialanie.trim().replace(" ","");
        char [] znaki = noweDzialanie.toCharArray();
        System.out.println(znaki);
        char nawiasOtwrcie ='(';
        char nawiasZamkniecie = ')';
        int liczbaOtwarc = 0;
        int liczbaZamkniec = 0;
        int indeksOtwarc=0;
        int indeksZamkniec=0;



//        for (int i = 0; i < znaki.length ; i++) {
//            if (znaki[i] == nawiasOtwrcie) {
//                liczbaOtwarc++;
//                indeksOtwarc=i;
//            }
//            else if (znaki[i] == nawiasZamkniecie) {
//                liczbaZamkniec++;
//                indeksZamkniec=i;
//
//            }
//        }

        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == '(') {
                liczbaOtwarc++;
            }
            if (znaki[i] == ')') {
                liczbaZamkniec++;
            }
            if (liczbaOtwarc < liczbaZamkniec) {
                break;
            }
        }

        System.out.println("Otwarcie" + liczbaOtwarc);
        System.out.println("Zamkniecie" +liczbaZamkniec);

        if (indeksZamkniec<indeksOtwarc){
            System.out.println("Błędnie wstawiony nawias!");
        }

        if (liczbaOtwarc!=liczbaZamkniec) {
            System.out.println("Błędna liczba nawiasów");
        }


    }
}
