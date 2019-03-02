package ZadCitizens;

public class Mieszczanin extends Mieszkaniec {

    public Mieszczanin(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
