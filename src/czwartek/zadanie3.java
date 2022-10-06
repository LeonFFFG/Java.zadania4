package czwartek;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wagę");
        double waga = keyboard.nextDouble();

        System.out.println("Podaj wzrost");
        double wzrost = keyboard.nextDouble();

        double bmi = (waga/wzrost * wzrost);



            if(bmi > 25 ) {
                System.out.println("Masz nadwagę, schudnij!!!");
                System.exit(0);
            }
            if(bmi < 18.5){
                System.out.println("Masz niedowagę, zacznij jeść!!!");
                System.exit(0);
            }
            else
                System.out.println("Masz odpowiednią wagę");

    }

}
