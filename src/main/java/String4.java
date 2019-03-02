import java.util.Scanner;

public class String4 {
    /*
    . Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie
     operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych.
     Program ma identykować sytuację wprowadzenia błędnego symbolu działania oraz próbę dzielenia
     przez zero. Zastosować instrukcję if else do wykonania odpowiedniego działania w zależności od
     wprowadzonego symbolu operacji. Scenariusz działania programu:
a. Program wyświetla informację o swoim przeznaczeniu.
b. Wczytuje pierwszą liczbę.
c. Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d. Wczytuje drugą liczbę.
e. Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
     */

    public static void main(String[] args) {

        System.out.println("Kalkulator dwóch liczb rzeczywistych.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj y:");
        double y = Double.parseDouble(scanner.nextLine());
        String dzialanie;
        do {
            System.out.println("Podaj działanie: +, -, /, *");
            dzialanie = scanner.nextLine();
            switch (dzialanie) {
                case "+":
                    double suma = x + y;
                    System.out.printf("Suma: %.2f + %.2f = %.2f ", x, y, suma);
                    System.out.println();
                    break;
                case "-":
                    double roznica = x - y;
                    System.out.printf("Suma: %.2f - %.2f = %.2f ", x, y, roznica);
                    System.out.println();
                    break;
                case "*":
                    double iloczyn = x * y;
                    System.out.printf("Suma: %.2f * %.2f = %.2f ", x, y, iloczyn);
                    System.out.println();
                    break;

                case "/":
                    if (y == 0) {
                        System.out.println("Nie dziel przez zero.");
                        System.out.println();
                    } else {
                        double iloraz = x / y;
                        System.out.printf("Suma: %.2f / %.2f = %.2f ", x, y, iloraz);
                    }
                    break;
                    default:
                        System.out.println("Błąd");
                        break;
            }

        } while (!dzialanie.equals("koniec"));
    }
}
