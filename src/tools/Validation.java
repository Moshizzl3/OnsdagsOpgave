package tools;

import java.util.Scanner;

public class Validation {

  private Scanner scanner = new Scanner(System.in);

  //metode til at validere vores input fra brugeren
  public int validateInteger() {


    int userInput;

    while (!scanner.hasNextInt()) {
      System.out.print("Ikke et accepteret input: ");
      scanner.nextLine();
    }

    userInput = scanner.nextInt();
    scanner.nextLine();

    return userInput;
  }


  public boolean erDetEnGyldigKarakter(int input) {

    //Valide karakter, som kan indtastes i systemet
    int[] valideKarakterer = {-3, 00, 02, 4, 7, 10, 12};

    for (int i = 0; i < valideKarakterer.length; i++) {
      if (input == valideKarakterer[i]){
        return true;
      }

    }

    return false;
  }

  //Valider om input til karakter er en korrekt karakter
  public int validateKarakterInput(){

    int userInput = validateInteger();

    while (!erDetEnGyldigKarakter(userInput)) {
      System.out.print("Ikke en gyldig karakter, forsøg igen: ");
      userInput = validateInteger();
    }

    return userInput;

  }


}
