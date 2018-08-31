package org.betavzw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Film> films = new ArrayList<>();
        int keuze;
        boolean isGestopt = false;
        System.out.println("--HOOFDMENU--");
        System.out.println("Wat wilt u doen?");
        String[] acties = new String[]{"Film toevoegen", "Film verwijderen", "Films bekijken", "STOPPEN"};
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d. %s%n", (i + 1), acties[i]);
        }
        do {
            String nog;
            keuze = Integer.parseInt(input.nextLine());
            switch (keuze) {
                case 1:
                    do {
                        System.out.print("Geef de naam van de film: ");
                        String filmNaam = input.nextLine();
                        System.out.print("Geef de regisseur: ");
                        String regisseur = input.nextLine();
                        System.out.print("Geef het jaar van de film: ");
                        String uitgave = input.nextLine();
                        System.out.print("Geef de namen van de acteurs: ");
                        String acteurs = input.nextLine();
                        System.out.println("Wilt u er nog eentje toevoegen(druk ENTER)");
                        nog = input.nextLine();
                        films.add(new Film(filmNaam, regisseur, uitgave, acteurs));
                    } while (nog.length() == 0);
                    break;
                case 2:
                    System.out.println("Welke film wilt u verwijderen? ");
                    String naamTeZoeken = input.nextLine();
//                    if(films.get().getFilmNaam().equals(naamTeZoeken)){
//
//                    }
                    break;
                case 3:
                    for (int i = 0; i < films.size(); i++) {
                        System.out.println(films.get(i).getFilmNaam());
                    }
                    System.out.println("Over welke film wilt u iets meer weten?");
                    String teWeten = input.nextLine();

                    break;
                case 4:
                    System.out.println("PROGRAMMA GESTOPT");
                    isGestopt = true;
                    break;
                default:
                    System.out.print("Foute ingave, probeer opnieuw: ");
                    break;
            }
        } while (keuze < 1 || keuze > 4 && !isGestopt);
    }
}

