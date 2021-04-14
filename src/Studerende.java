import java.util.ArrayList;

public class Studerende {

  private String navn;
  private ArrayList<Integer> karakterer = new ArrayList<>();

  public Studerende(String navn) {
    this.navn = navn;
  }

  public String getNavn() {
    return navn;
  }

  public void addKarakterer(int a,int b,int c, int d ,int e, int q, int u) {  //Sende karakterer videre
    karakterer.add(a);
    karakterer.add(b);
    karakterer.add(c);
    karakterer.add(d);
    karakterer.add(e);
    karakterer.add(q);
    karakterer.add(u);
  }
  public void visKarakterer() {
    for (int i = 0; i < karakterer.size(); i++) {
      System.out.print(karakterer.get(i) + " ");
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
