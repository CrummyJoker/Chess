public class Nappula{
  private boolean onkoSiirretty;
  private boolean voikoSiirtaa;
  private boolean onkoSyoty;
  int x;
  int y;
  private String printti;
  Vari vari;
  Tyyppi tyyppi;
  
  Nappula(Vari vari,Tyyppi tyyppi,int x,int y) {
    this.vari = vari;
    this.x = x;
    this.y = y;
    printti = "["+vari+tyyppi.toString()+"]";
  }
  String toString() {
    return printti;
  } 
  boolean onkoSiirtoLaillinen() {
    return Tyyppi.tyyppi.onkoSiirtoLaillinen();
  }
  void asetaKoo(int x,int y) {
    this.x = x;
    this.y = y;
  }
  void asetaX(int x) {
    this.x = x;
  }
  void asetaY(int y) {
    this.y = y;
  }
  int annaX() {
    return x;
  }
   int annaY() {
     return y;
   }
  void asetaTyyppi(Tyyppi tyyppi) {
    this.tyyppi = tyyppi;
  }
  Tyyppi annaTyyppi() {
    return tyyppi;
  }
 }
  
