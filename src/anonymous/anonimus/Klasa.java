package anonymous.anonimus;
import java.util.Scanner;
public class Klasa {

        public static void main(String[] args) {
            /*
             * Przykład wczytywania i wyświetlania liczb (danych)
             */
            // Stworzenie obiektu klasy Scanner z parametrem System.in
            // Ten obiekt posłuży do wczytywania liczb (danych)
            Scanner in = new Scanner(System.in);
            // Przed wczytywanie danych należy poinformować użytkownika,
            // co konkretnie ma wykonać:
            System.out.println("Podaj 5 liczb");
            int a = in.nextInt();

            // w tym przypadku metoda obiektu in
            // (klasy Scanner) nextInt() powoduje wczytanie
            // liczby z klawiatury.

            // Wyświetlenie tekstu oraz wartości wczytanej liczby:
            System.out.println("Wczytane liczby, to: " + a);


            /*
             * Obiekt in posiada więcej metod, których listę można zobaczyć
             * po wpisaniu:
             * in.
             */
            //Dane można też wczytywać do wcześniej zadeklarowanych zmiennych:
            System.out.println("Podaj nową liczbę całkowitą");
            a = in.nextInt();
            System.out.println("Wczytana liczba, to: " + a);

            // Oczywiście istnieje możliwość wczytania liczby rzeczywistej:
            System.out.println("Podaj liczbę rzeczywistą");
            float f = in.nextFloat();

            System.out.println("Wczytana liczba, to: " + f);

            // Metoda println powoduje wyświetlenie komunikatu i przejście do nowej
            // linii natomiast metoda print tylko wyświetla komunikat:
            System.out.print("Komunikat 1a");
            System.out.print("Komunikat 2a");
            System.out.println(); // Nowa linia
            System.out.println("Komunikat 1b");
            System.out.println("Komunikat 2b");

            // Przejście do nowej linii można również wymusić wstawiając znak '\n'
            System.out.print("Komunikat 1c\nKomunikat 2c\n");

            // W podobny sposób można wstawić znak tabulacji itp.
            System.out.println("Komunikat 1d\tKomunikat 2d");

            // Dodatkowo można zastosować wyświetlanie danych podobne do
            // znanego printf
            // %f oznacza, że w to miejsce zostanie wstawiona liczba rzeczywista
            // %d oznacza, że w to miejsce zostanie wstawiona liczba całkowita
            System.out.format("Podana liczba całkowita wynosi %d, natomiast "
                    + "rzeczywista %f. Wynik dzielenia: %f\n", a, f, a/f);

            // W tym przypadku można wyświetlić również liczbę rzeczywistą z
            // dokładnością do określonego miejsca po przecinku. Wystarczy wtedy
            // pomiędzy znakiem '%' a oznaczeniem 'f' dopisać kropkę '.' i liczbę
            // oznaczającą dokładność. Np. %.3f oznacza, że liczba ma zostać
            // wyświetlona na 3 miejsca po przecinku.
            System.out.format("L. rzeczywista %.3f. Wynik: %.2f\n", f, a/f);

            System.out.format("\nPI: %.4f, %.3f, %.2f, %.1f, %.0f\n",
                    Math.PI, Math.PI, Math.PI, Math.PI, Math.PI);
        }

    }



    /*public static void main(String[] args) {
        Klasa scan = new Klasa(System.in);
        System.out.println("Podaj pięć cyfr");


        System.out.println("Dziękuję ");

}*/
