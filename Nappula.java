public class Nappula{
  private boolean onkoSiirretty;
  private boolean voikoSiirtaa;
  private boolean onkoSyoty;
  int x;
  int y;
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
  void asetaKoo(int x,int y) {
    this.x = x;
    this.y = y;
  }
}
