package czwartek;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zadanie7 {
    public static class zadanie7 {
        public static void main(String[] args) {
            String slowa, Imie1, Imie2, Imie3;
            Scanner klawisz = new Scanner(System.in);

            System.out.println("Podaj pierwsze imię");
            Imie1 = klawisz.nextLine();
            System.out.println("Podaj drugie imię");
            Imie2 = klawisz.nextLine();
            System.out.println("Podaj trzecie imię");
            Imie3 = klawisz.nextLine();

            List<String> patients = new LinkedList<>();
            patients.add(Imie1);
            patients.add(Imie2);
            patients.add(Imie3);
            Collections.sort(patients);
            for (String patient : patients) {
                System.out.println(patient);
            }

        }
    }
}
