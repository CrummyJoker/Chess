public class Nappula{
  private boolean onkoSiirretty;
  private boolean voikoSiirtaa;
  private boolean onkoSyoty;
  private printti;
  Vari vari;
  Tyyppi tyyppi;
  
  Nappula(Vari vari,Tyyppi tyyppi) {
    this.vari = vari;
    printti = "["+vari+tyyppi.toString()+"]";
  }
  String toString() {
    return printti;
}
