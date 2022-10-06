package wtorek;

import java.util.Scanner;
public class Produkt {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        double podatekStanowy;
        podatekStanowy = 0.04;
        double podatekLokalny;
        podatekLokalny = 0.02;
        double podatki;
        podatki = (double) podatekLokalny+podatekStanowy;
        System.out.println("Wartość produktu ");
        double wartoscProduktu= klawiatura.nextDouble();
        klawiatura.nextLine();
        double lacznaCenaSprzedazy;
        lacznaCenaSprzedazy = (double)podatki+wartoscProduktu;
        System.out.println("Podatek lokalny: " + podatekLokalny + "\n" + "Podatek stanowy: " + podatekStanowy + "\n" + "Wartość produktu: " + wartoscProduktu + "\n" + "Łączna cena sprzedazy: " + lacznaCenaSprzedazy);






    }
}
