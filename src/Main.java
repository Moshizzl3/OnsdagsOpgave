import java.util.ArrayList;

public class Main {
private ArrayList<Studerende>elevliste = new ArrayList<>();
  Studerende student = new Studerende("Hans");
  Studerende student1 = new Studerende("Bo");




  public static void main(String[] args) {
    Main main = new Main();

    main.renderElever();
    main.visListe();


    }
    public void visListe()  {
      for (int i = 0; i < elevliste.size(); i++) {
        System.out.println(elevliste.get(i).getNavn() + ": ");
        elevliste.get(i).visKarakterer();
      }
    }

    public void renderElever(){
      student.addKarakterer(2,2,2,2,2,2,2);
      student1.addKarakterer(2,2,2,2,2,2,2);

    }



  }


