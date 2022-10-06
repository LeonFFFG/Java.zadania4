package czwartek;

import java.util.Scanner;

public class zadanie5a {
    public static class zadanie5 {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Podaj wagę");
            double masa = keyboard.nextDouble();



            double ciezar = (masa * 9.8);



            if(ciezar > 1000) {
                System.out.println("obiekt jest zbyt ciezki");
                System.exit(0);
            }
            if(ciezar < 10){
                System.out.println("obiekt jest za lekki");
                System.exit(0);
            }

            else{
                System.out.println(ciezar);
            }



        }

    }
}

