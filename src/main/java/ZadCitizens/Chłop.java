package ZadCitizens;

public class Chłop extends Mieszkaniec {

    public Chłop(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
