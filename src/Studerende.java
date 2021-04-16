
public class Studerende {

  private String navn;
  private double [] karakterer = new double[7];

  public Studerende(String navn) {
    this.navn = navn;
  }

  public String getNavn() {
    return navn;
  }

  public void addKarakterer(double[] karakterer) {  //Sende karakterer videre
    this.karakterer = karakterer;
  }
  public void visKarakterer() {
    for (int i = 0; i < karakterer.length; i++) {
      System.out.print(karakterer[i] + " ");
    }
    System.out.println();
  }

  public double vægtetKarakter(int karakter1, int karakter2){
    double vægtetKarakter = 0;
    vægtetKarakter += (karakter1 * 0.25);
    vægtetKarakter += (karakter2 * 0.75);

    return vægtetKarakter;
  }
}
