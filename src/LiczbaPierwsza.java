//Sprawdzanie liczby pierwszej: Napisz program, który sprawdzi, czy podana liczba jest liczbą pierwszą.
// Program powinien pobierać liczbę od użytkownika i wyświetlać odpowiedni komunikat.
import java.util.Scanner;

public class LiczbaPierwsza {
    public static boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }

        // Sprawdzamy dzielniki od 2 do pierwiastka kwadratowego z liczby
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false; // Liczba ma dzielnik, więc nie jest pierwsza
            }
        }

        return true; // Jeśli nie znaleziono dzielników, liczba jest pierwsza
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (czyLiczbaPierwsza(liczba)) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }
    }
}
