public enum Tyyppi{ 
    public enum Tyyppi{
  K("K"), Q("Q"), T("T"), L("L"), S("S"), R("R"), E(" ");
  //Note: The constructor for an enum type must be package-private or private access. 
  //It automatically creates the constants that are defined at the beginning of the enum body. You cannot invoke an enum constructor yourself. 
  private String symboli;
  private Tyyppi(String symboli) {
    this.symboli = symboli;
  }
  public String annaSymboli() {return symboli;}
  
  // }, S("S") {
  //  boolean promootio; // Mieluummin Shakki-luokkaan
  //  boolean ohesta; // Myöskin mieluummin Shakki-luokkaan
// eri enum-vakioille ei voi uudelleentoteuttaa samaa metodia(?) vaan on käytettävä yhtä samaa metodia niille kaikille
        // Metodi testaa, onko siirron vaatima liikerata sallittu kyseenomaiselle nappulatyypille
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin, Vari v, boolean siirretty, Tyyppi t) {
      if (t==Tyyppi.S){ //sotilas
        if (v == Vari.M) {
          if (Xmihin - Xmista == 1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1)) { // syÃ¶nti: diagonaalinen siirto
            //siirra(); //siirra() siirretty Shakki-luokkaan samannimisen metodin alle
            return true;
          }
          if (siirretty == false) { //
            if ((Xmihin - Xmista == 2 || Xmihin - Xmista == 1) && Ymihin - Ymista == 0) {
              //siirra();
              return true; //vaihda sotilaan onSiirretty-attribuutin arvoksi true ja palauta true
            }
          } else { // ei ensimmÃ¤inen siirto
            if (Xmihin - Xmista == 1 && Ymihin - Ymista == 0) {
              return true;
            }
          }
        } else { // sama kuin edellÃ¤ valkeille nappuloille
          if (Xmihin - Xmista == -1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1))
          { // syÃ¶nti
            //siirra();
            return true;
          }
          if (siirretty == false) {
            if ((Xmihin - Xmista == -2 || Xmihin - Xmista == -1) && Ymihin - Ymista == 0) {
              //siirra();
              return true;
            }
          } else {
            if (Xmihin - Xmista == -1 && Ymihin - Ymista == 0) {
              return true;
            }
          }
        }
    //return false; //ehkä loppuun? Joo loppuun!!
      }
      //torni
      if (t==Tyyppi.T){
        if (Xmista - Xmihin == 0 && Ymista - Ymihin != 0) { //yhden akselin suuntainen liike
          return true;
        } else if (Xmista - Xmihin != 0 && Ymista - Ymihin == 0) { // ja toisen akselin
          return true;
        } else {
          return false;
        }
      }
      
      // lähetti
      if (t==Tyyppi.L){
        if (Math.abs((Ymihin - Ymista)/(Xmihin - Xmista))== 1) {
          return true;
        } else { 
          return false;
        }
      }
      
      //Q
      if (t==Tyyppi.Q) {
        if (Math.abs((Ymihin - Ymista)/(Xmihin - Xmista))== 1) { //diagonaalinen liike
          return true;
        } else if (Xmista - Xmihin == 0 && Ymista - Ymihin != 0) { //yhden akselin suuntainen liike
          return true;
        } else if (Xmista - Xmihin != 0 && Ymista - Ymihin == 0) { // ja toisen akselin
          return true;
        } else {
          return false;
        }
      }
      // Kuningas
      if (t==Tyyppi.K) {
        if (Math.abs(Ymihin - Ymista) == 1 && Math.abs(Xmihin - Xmista) == 1) { //diagonaalinen liike
          return true;
        } else if ((Math.abs(Ymihin - Ymista) ==1 && Math.abs(Xmihin - Xmista) == 0) || (Math.abs(Ymihin - Ymista) ==0 && Math.abs(Xmihin - Xmista) == 1)){
          return true;
        } else {
          return false;
        }
      }
      //Ratsu
      if (t==Tyyppi.R) {
        if ((Math.abs(Ymihin - Ymista) == 2 && Math.abs(Xmihin - Xmista) == 1) || (Math.abs(Ymihin - Ymista) == 1 && Math.abs(Xmihin - Xmista) == 2)) {
          return true;
        } else {
          return false;
        }
      }
      // tyhjä nappula
      if (t==Tyyppi.E) {
        return false;
      } 
      return false;
    }
  }
}
