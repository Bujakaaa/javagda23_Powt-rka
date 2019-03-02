package ZadCitizens;

public class Żołnierz extends Mieszkaniec {

    public Żołnierz(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return true;
    }

}
