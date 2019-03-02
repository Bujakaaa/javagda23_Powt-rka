package ZadCitizens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Miasto {

    private Mieszkaniec [] mieszkaniecs;

    public Miasto(Mieszkaniec[] mieszkaniecs) {
        this.mieszkaniecs = mieszkaniecs;
    }

    public Mieszkaniec[] getMieszkaniecs() {
        return mieszkaniecs;
    }

    public void dodajMieszkanca (Mieszkaniec mieszkaniec) {



//        List <Mieszkaniec> listaMieszkancow = new ArrayList<>(Arrays.asList(mieszkaniecs));
//        listaMieszkancow.add(mieszkaniec);
//        System.out.println(listaMieszkancow);
        Mieszkaniec [] nowy = new Mieszkaniec[mieszkaniecs.length+1];
        Mieszkaniec [] mieszkancy = this.mieszkaniecs;
        for (int i = 0; i < nowy.length -1 ; i++) {
            nowy[i] = mieszkancy[i];
        }
        nowy [nowy.length-1] = mieszkaniec;
        System.out.println(Arrays.toString(nowy));
    }

//    public int iluMozeGlosowac () {
//        int licznik =0;
//        Mieszkaniec [] mieszkaniecs1 = this.mieszkaniecs;
//
//        for (int i = 0; i < mieszkaniecs1.length; i++) {
//            Mieszkaniec mieszkaniec = mieszkaniecs1 [i];
//         if (mieszkaniec.canVote()) {
//             licznik++;
//         }
//        }
//        return licznik;
//    }
//
//    public Mieszkaniec [] ktoMozeGlosowac () {
//        Mieszkaniec [] zdolniDoGlosowania = new Mieszkaniec[this.iluMozeGlosowac()];
//        Mieszkaniec [] mieszkancy = this.mieszkaniecs;
//        int pozycja =0;
//
//        for (int i = 0; i < mieszkancy.length; i++) {
//            Mieszkaniec mieszkaniec = mieszkancy [i] ;
//            if (mieszkaniec.canVote()) {
//                zdolniDoGlosowania [pozycja++] = mieszkaniec;
//            }
//        }
//
//    return zdolniDoGlosowania;
//    }

public int iluMozeGlosowac () {
        int licznik = 0;
        Mieszkaniec [] mieszkancy = this.mieszkaniecs;

    for (Mieszkaniec m : mieszkancy) {
        if(m.canVote()) {
            licznik++;
        }
    }
        return licznik;
}

public Mieszkaniec [] ktoMozeGlosowac () {
        Mieszkaniec [] zdolniDoGlosowania = new Mieszkaniec[iluMozeGlosowac()];
        Mieszkaniec [] mieszkancy = this.mieszkaniecs;
        int pozycja = 0;

        for (Mieszkaniec m: mieszkancy) {
            if (m.canVote()) {
                zdolniDoGlosowania[pozycja++] = m;
            }
        }

        return zdolniDoGlosowania;
}










    @Override
    public String toString() {
        return "Miasto{" +
                "mieszkaniecs=" + Arrays.toString(mieszkaniecs) +
                '}';
    }
}
