public class Nappula{
  private boolean onkoSiirretty = false;
  private boolean onkoSyoty = false; //tata attribuuttia ei kayteta pelissa viela mihinkaan
  int x;
  int y;
  private String printti;
  Vari vari;
  Tyyppi tyyppi;
  
  Nappula(Vari vari,Tyyppi tyyppi,int x,int y) {
    this.vari = vari;
    this.tyyppi = tyyppi;
    this.x = x;
    this.y = y;
    printti = "["+vari+tyyppi.toString()+"]";
  }
  
  public String toString() {
    return printti;
  }
  boolean annaOnkoSiirretty() {
    return onkoSiirretty;
  }
  void asetaOnkoSiirretty(boolean x) {
    this.onkoSiirretty = x;
  }
  public void asetaKoo(int x,int y) {
    this.x = x;
    this.y = y;
  }
  public void asetaX(int x) {
    this.x = x;
  }
  public void asetaY(int y) {
    this.y = y;
  }
  public int annaX() {
    return x;
  }
  public int annaY() {
     return y;
   }
  public void asetaVari(Vari vari) {
    this.vari = vari;
  }
  public Vari annaVari(){
    return vari;
  }
  public void asetaTyyppi(Tyyppi tyyppi) {
    this.tyyppi = tyyppi;
  }
  public Tyyppi annaTyyppi() {
    return tyyppi;
  }
  public void asetaOnkoSyoty(boolean b) {
    onkoSyoty = b;
  }
  public boolean annaOnkoSyoty() {
    return onkoSyoty;
  }
 }
  
