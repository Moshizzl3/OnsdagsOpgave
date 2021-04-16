package tools;

import studerende.Studerende;

import java.util.ArrayList;
import java.util.Scanner;


public class EventManager {

  private String[] menustuff = {"1. Opret en studerende", "2. Giv studerende en karakter", "3. Udskriv karakter for en studerende", "9. Afslut"};
  private UI UI = new UI("tools", "Indtast valg: ", menustuff);
  private Validation validation;
  private ArrayList<Studerende> studenterListe = new ArrayList<>();

  public void run() {
    boolean quit = false;

    while (!quit) {
      UI.printMenu();
      int choice = UI.readChoice();

      switch (choice) {
        case 1:
          opretEnStuderende();
          break;
        case 2:
          findStuderende().addKarakterer(inputKarkterer());
          break;
        case 3:
          findStuderende().visKarakterer();
          break;
        case 9:
          quit = true;
          System.out.println("Du har afsluttet, hav en god dag.");
          break;
        default:
          System.out.println("Indtast et valg");
          break;
      }
    }

  }

  public void opretEnStuderende() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Indtast Navn: ");
    String navn = scanner.nextLine();
    Studerende studerende = new Studerende(navn);
    studenterListe.add(studerende);
  }

  private double[] inputKarkterer() {
    double[] karakterer = new double[7];

    for (int i = 0; i < karakterer.length; i++) {

      if (i == karakterer.length - 1) {
        System.out.print("Indtast delKarakter" + (i + 1) + " 1: ");
        int k1 = new Validation().validateKarakterInput();
        System.out.print("Indtast delKarakter" + (i + 1) + " 2: ");
        int k2 = new Validation().validateKarakterInput();
        double vk = vægtetKarakter(k1, k2);
        karakterer[i] = vk;

      } else {
        System.out.print("Skriv karakter " + (i + 1) + ": ");
        karakterer[i] = new Validation().validateKarakterInput();
      }
    }
    return karakterer;
  }

  private double vægtetKarakter(int karakter1, int karakter2) {
    double vægtetKarakter = 0;
    vægtetKarakter += (karakter1 * 0.25);
    vægtetKarakter += (karakter2 * 0.75);

    return vægtetKarakter;
  }

  public Studerende findStuderende() {

    int choice;

    System.out.println("Hvilken studerende?");
    listeMedStuderende();
    choice = new Validation().validateInteger();
    return studenterListe.get(choice - 1);

  }

  public void listeMedStuderende() {
    for (int i = 0; i < studenterListe.size(); i++) {
      System.out.println((i + 1) + " . " + studenterListe.get(i).getNavn());
    }
  }
}
