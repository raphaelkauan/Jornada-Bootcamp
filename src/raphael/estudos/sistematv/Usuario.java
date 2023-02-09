package raphael.estudos.sistematv;

public class Usuario {
  
  public static void main(String[] args) throws Exception {

    /* Chamando o outro arquivo */
    SmartTv smartTv = new SmartTv();

    System.out.println(" A Tv está ligada? " + smartTv.ligada);
    System.out.print(" Canal atual : " + smartTv.canal);
    System.out.print(" Volume atual : " + smartTv.volume);

    /* Chamando o novo Método */
    smartTv.ligar ();
    System.out.println(" (A Tv está ligada?) " + smartTv.ligada);
  }
}
