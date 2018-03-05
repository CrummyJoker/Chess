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
  public String toString() {
    return printti;
  } 
  boolean onkoSiirtoLaillinen(int nx,int ny,int mx,int my) {
    boolean temp = tyyppi.onkoSiirtoLaillinen(nx,ny,mx,my,this.vari,this.onkoSiirretty);
    return temp;
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
    printti = "["+vari+tyyppi.toString()+"]";
  }
  Tyyppi annaTyyppi() {
    return tyyppi;
  }
  boolean annaOnkoSiirretty() {
    return onkoSiirretty;
  }
  void asetaOnkoSiirretty(boolean x) {
    this.onkoSiirretty = x;
  }
  boolean annaOnkoSyoty() {
    return onkoSyoty;
  }
  void asetaOnkoSyoty(boolean b) {
    onkoSyoty = b;
  }
  Vari annaVari() {
    return vari;
  }
  void asetaVari(Vari vari) {
    this.vari = vari;
  }
 }
