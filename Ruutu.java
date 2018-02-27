public class Ruutu{
  Nappula n;
  String printti;
  int x;
  int y;
  
  Ruutu(int x,int y) {
    this.x = x;
    this.y = y;
    printti = "---." + " ";
  }
  Ruutu(int x,int y,Nappula n) {
    this.x = x;
    this.y = y;
    this.n = n;
    if (n.vari==Vari.M) {
      printti =   n.vari + n.symboli  + " ";
    } else if (n.vari==Vari.V) {
      printti = n.vari + n.symboli + "  ";
    }
  }
  public String toString() {
    return printti;
  }
  void siirra(int x,int y) {
    this.x = x;
    this.y = y;
  } 
}
