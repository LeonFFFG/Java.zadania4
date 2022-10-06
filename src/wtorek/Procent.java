package wtorek;

public class Procent {

    public static void main(String[] args){
        double iloscGotowki;
        iloscGotowki = 4.6;
        double sprzedaz;
        sprzedaz = 0.62;
        double wygenerowanaSprzedaz;
        wygenerowanaSprzedaz = (double)iloscGotowki/sprzedaz;
        System.out.println("Wygenerowana sprzedaz przez region mazowiecki wynosi: " + wygenerowanaSprzedaz);

    }
}
