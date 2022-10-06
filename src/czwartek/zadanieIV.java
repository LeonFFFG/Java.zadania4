package czwartek;

import java.util.Scanner;

public class zadanieIV {

        public static void main(String[] args) {


            Scanner keyboard = new Scanner(System.in);

            System.out.println("Podaj pierwszą liczba");
            double pierwszaLiczba = keyboard.nextDouble();

            System.out.println("Podaj drugą liczba");
            double drugaLiczba = keyboard.nextDouble();

            System.out.println("Podaj trzecia liczba");
            double trzeciaLiczba = keyboard.nextDouble();


            double srednia = ( (pierwszaLiczba + drugaLiczba + trzeciaLiczba) / 3 );

            if(srednia >= 90) {
                System.out.println("Średnia: " + "" + srednia + "Ocena:" + "5");
            }
            if(srednia >= 80 ) {
                System.out.println("Średnia:" + "" + srednia + "Ocena:" + "4");
            }
            if(srednia >= 70) {
                System.out.println("Średnia:" + "" + srednia + "Ocena:" + "3");
            }
            if(srednia >= 60) {
                System.out.println("Średnia:" + "" + srednia + "Ocena:" + "2");
            }
            else {
                System.out.println("Średnia:" + "" + srednia + "Ocena:" + "1");
            }
        }
    }

