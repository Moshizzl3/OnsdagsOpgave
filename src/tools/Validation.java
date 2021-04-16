package tools;

import java.util.Scanner;

public class Validation {

  private Scanner scanner = new Scanner(System.in);

  //method to validate userinput, here we insure that we get an int from the user
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
}
