import java.util.ArrayList;

public class Studerende {

  private String navn;
  private int [] karakterer = new int [7];

  public Studerende(String navn) {
    this.navn = navn;
  }

  public String getNavn() {
    return navn;
  }

  public void addKarakterer(int a,int b,int c, int d ,int e, int f, int g) {  //Sende karakterer videre
    karakterer[0] = a;
    karakterer[1] = b;
    karakterer[2] = c;
    karakterer[3] = d;
    karakterer[4] = e;
    karakterer[5] = f;
    karakterer[6] = g;
  }
  public void visKarakterer() {
    for (int i = 0; i < karakterer.length; i++) {
      System.out.print(karakterer[i] + " ");
    }
    System.out.println();
  }

  public double vægtetKarakter(int karakter1, int karakter2){
    double vægtetKarakter = 0;
    vægtetKarakter += (karakter1*0.25);
    vægtetKarakter += (karakter2 *0.75);

    return vægtetKarakter;
  }
}
