package ZadCitizens;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mieszkaniec [] mieszkaniecs = new Mieszkaniec[] {
                new Chłop("Mietek"),
                new Żołnierz("Henryk"),
                new Król("Mieszko"),
                new Mieszczanin("Zbyszek")};

        Miasto miasto = new Miasto(mieszkaniecs);
        System.out.println(miasto);

        System.out.println(miasto.iluMozeGlosowac());
        System.out.println(Arrays.toString(miasto.ktoMozeGlosowac()));
        miasto.dodajMieszkanca(new Chłop("Wiesiek"));





    }
}
