package ZadComparatory;

import java.util.Comparator;

public class ComparatorWiek implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        if (o1.getWiek() < o2.getWiek()) {
            return 1
        } else if (o1.getWiek() == o2.getWiek()) {
            return 0;
        }
        return -1;
    }
}
