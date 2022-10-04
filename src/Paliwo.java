import java.util.Scanner;

public class Paliwo {
    public static void main(String[] args){

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj przejechane kilometry: ");
        int kilometry = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj litry paliwa ");
        double paliwo = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometryNaLitrze = kilometry/paliwo;

        System.out.println("Kilometry: " + kilometry + ", Paliwo: " +
                paliwo + ", Kilometry na litrze: " + kilometryNaLitrze);
    }
}










