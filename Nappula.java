public class Nappula{
  private boolean onkoSiirretty;
  private boolean voikoSiirtaa;
  private boolean onkoSyoty;
  int x;
  int y;
  private String printti;
  Vari vari;
  Tyyppi tyyppi;
  
  public Nappula(Vari vari,Tyyppi tyyppi,int x,int y) {
    this.vari = vari;
    this.x = x;
    this.y = y;
    printti = "["+vari+tyyppi.toString()+"]";
  }
  public String toString() {
    return printti;
  } 
 // boolean onkoSiirtoLaillinen() { Metodi on jo kirjoitettu Tyyppi-enumiin
   // return Tyyppi.tyyppi.onkoSiirtoLaillinen();
  //}
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
  public Vari annaVari(){
    return vari;
  }
  public void asetaTyyppi(Tyyppi tyyppi) {
    this.tyyppi = tyyppi;
  }
  public Tyyppi annaTyyppi() {
    return tyyppi;
  }
 }
  
