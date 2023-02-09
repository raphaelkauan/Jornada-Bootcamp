package raphael.estudos.sistematv;

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  /* Criando o método Ligar */
  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  /* Criando o método Aumentar Volume */
  public void aumentarVolume() {
    /* volume = volume +1; */
    volume++;
  }

  public void diminuirVolume() {
    /* volume = volume +1; */
    volume--;
  }
}
