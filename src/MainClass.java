public class MainClass {
  public static void main(String[] args) {

 MovableAdapterImpl test = new MovableAdapterImpl ();
 test.speeKm = 180;


    System.out.println("\n****** Conversion :  ****\n"+test.speeKm+
      " miles/h === Vaut === "+test.Speed ()+" Km/h");

  }
}
