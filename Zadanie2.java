package Zadanie2;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 5;
        System.out.println("Wartość x: " + x);
        System.out.println("Podaj liczbę w postaci stringa:");
        String cyfra = scan.nextLine();
        System.out.println("Podany przez ciebie string to:" + cyfra);
        try {//część kodu zabezpieczona przed szczególnym zachowaniem oprogramowania
            int y = Integer.parseInt(cyfra);//zamiana zmiennej typu String na int i wpisanie jej do zmiennej y
            int wynik = y + x;
            System.out.println("Wynik dodawania x do podanej liczby: " + wynik);
        } catch (NumberFormatException e) {//kod wykonany w razie wystapienia zdefiniowanego wyjątku
            e.printStackTrace();
            System.out.println("W razie wpisania znaków nie tworzących liczby całkowitej," +
                    " nie większej niz zakres int, bez obsługi wyjątków ten komunikat " +
                    "\nwyświetlił by się razem z exit code 1 (czyli błędem programu).");
        }
    }
}
