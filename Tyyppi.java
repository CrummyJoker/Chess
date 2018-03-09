// pelinappulan tyyppi: S=sotilas, T=torni, L=lähetti, R=ratsu, Q=kuningatar, K=kuningas, E=tyhjä "ei nappulaa"
// onkoSiirtoLaillinen():boolean Jos siirto laillinen siirtyvälle nappulalle, return true. Else return false.
public enum Tyyppi{
  S("S"){
     //onko siirto sallittu sotilaan liikeradoille: ensimmäisellä siirrolla 1 tai 2 ruutua eteen, muilla siirroilla 1 eteen, syödessä 1 vinottain eteen
      public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
        // valkeat sotilaat
        if (v == Vari.M) {
          if (Xmihin - Xmista == 1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1)) { // syönti: diagonaalinen siirto
            return true;
          }
          if (siirretty == false) { //
            if ((Xmihin - Xmista == 2 || Xmihin - Xmista == 1) && Ymihin - Ymista == 0) {
              //siirra();
              return true; //vaihda sotilaan onSiirretty-attribuutin arvoksi true ja palauta true
            }
          } else { // ei ensimmäinen siirto
            if (Xmihin - Xmista == 1 && Ymihin - Ymista == 0) {
              return true;
            }
          }
          // mustat sotilaat
        } else {
          if (Xmihin - Xmista == -1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1))
          {
            return true;
          }
          if (siirretty == false) {
            if ((Xmihin - Xmista == -2 || Xmihin - Xmista == -1) && Ymihin - Ymista == 0) {
              return true;
            }
          } else {
            if (Xmihin - Xmista == -1 && Ymihin - Ymista == 0) {
              return true;
            }
          }
        }
        return false;
      }
    }
  ,
    // torni
    T("T") {
       public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
         if (Xmista - Xmihin == 0 && Ymista - Ymihin != 0) { // laudan y-akselin suuntainen liike
            return true;
          } else if (Xmista - Xmihin != 0 && Ymista - Ymihin == 0) { // x-akselin suuntainen liike
            return true;
          }
          return false;
       }
    }
  ,
    // lähetti
    L("L") {
      public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
        if (Math.abs((Ymihin - Ymista)/(Xmihin - Xmista))== 1) {
            return true; 
        }
        return false;
      }
    }
  ,
    // ratsu
    R("R") {
      public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
        if ((Math.abs(Ymihin - Ymista) == 2 && Math.abs(Xmihin - Xmista) == 1) || (Math.abs(Ymihin - Ymista) == 1 && Math.abs(Xmihin - Xmista) == 2)) {
            return true;
        }
        return false;
      }
    }
    ,
      // kuningatar
    Q("Q") {
      public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty){
        if (Math.abs((Ymihin - Ymista)/(Xmihin - Xmista))== 1) { //diagonaalinen liike
          return true;
        }
        if (Xmista - Xmihin == 0 && Ymista - Ymihin != 0) { // laudan y-akselin suuntainen liike
          return true;
        }
        if (Xmista - Xmihin != 0 && Ymista - Ymihin == 0) { // laudan x-akselin suuntainen liike
          return true;
        }
        return false;
      }
    }
 ,
   //kuningas
    K("K") {
      public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
        if (Math.abs(Ymihin - Ymista) == 1 && Math.abs(Xmihin - Xmista) == 1) { //diagonaalinen liike, siirtyy yhden ruudun vinottain
            return true;
        }
        // x- ja y-akselien suuntainen liike: siirtyy yhden ruudun jommallakummalla akselilla kumpaan tahansa suuntaan
        if ((Math.abs(Ymihin - Ymista) ==1 && Math.abs(Xmihin - Xmista) == 0) || (Math.abs(Ymihin - Ymista) ==0 && Math.abs(Xmihin - Xmista) == 1)){
          return true;
        }
        return false;
      }
    }
  , 
    // ei nappulaa
   E("E") {
     public boolean onkoSiirtoLaillinen(int Xmista, int Xmihin, int Ymista, int Ymihin, Vari v, boolean siirretty) {
        return false; //tyhjää ei voi siirtää, palauta aina false
      }
    };
 

  private String symboli;
  private Tyyppi(String symboli) {
    this.symboli = symboli;
  }
  public String annaSymboli() {return symboli;}
  public abstract  boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b);
}
