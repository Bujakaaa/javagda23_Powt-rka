package ZadCitizens;

public class Król extends Mieszkaniec {

    public Król(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
