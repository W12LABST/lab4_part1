package Zadanie3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tablica[] = {1, 2, 4, 1, 2, 3, 1, 1, 2, 4};
        System.out.println("Podaj adres 10 elementowej tablicy, którego element chcesz wyswietlić: ");
        try {//część kodu zabezpieczona przed szczególnym zachowaniem oprogramowania
            int nrElmentu = scan.nextInt();
            System.out.println("Adres o nr: " + nrElmentu + "\tzawiera wartość: " +  tablica[nrElmentu]);
        } catch (Exception e) {//kod wykonany w razie wystapienia zdefiniowanego wyjątku
            e.printStackTrace();
            System.out.println("W razie wpisania adresu spoza tablicy lub czegokolwiek niedozwolonego, bez obsługi wyjątków ten komunikat by się " +
                    "wyświetlił razem z exit code 1 (czyli błędem programu).");
        }
    }
}
