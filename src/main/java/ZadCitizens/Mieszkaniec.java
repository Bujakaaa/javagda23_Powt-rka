package ZadCitizens;

public abstract class Mieszkaniec {
    private String imie;

    public Mieszkaniec(String imie) {
        this.imie = imie;
    }

    public abstract boolean canVote ();

    @Override
    public String toString() {
        return "Mieszkaniec{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
