import java.util.Scanner;

public class StringoweZad {
    public static void main(String[] args) {

        //1. Napisz program który wczytuje od użytkownika tekst, a następnie dla tego tekstu zamienia wszystkie
        // wystąpienia przecinków (“, “) na słowo “makarena”.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        System.out.println(tekst.replace(",", "makarena"));

        //2. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie zamienia cały tekst na:
        //a. same duże litery
        //b. same małe litery

        System.out.println("małe literki: " + tekst.toLowerCase());
        System.out.println("wielkie literki: "+ tekst.toUpperCase());

        //3. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
        // Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu
       // ala lubi koty, ale ala nie jest przez koty lubiana


        System.out.println("Podaj tekst:");
        String tekst2= scanner.nextLine().trim().toLowerCase().replace(",", "");
        String [] slowa = tekst2.split(" ");

        for (int i = 0; i < slowa.length ; i++) {
            String aktualne = slowa[i];
            int licznik = 0;
            boolean powtorzone = false;

            for (int j = 0; j < slowa.length; j++) {
                String aktualne2 = slowa[j];
                if (aktualne.equals(aktualne2)){
                    if (i>j) {
                        powtorzone= true;
                       break;
                    }
                    licznik++;

                    //ala kot ala  (i=1 i j=3) jezeli ala=ala to i<j to nie licz j
                }
            }
            if(!powtorzone)
            System.out.println(aktualne +" "+ licznik);
        }

    }
}

