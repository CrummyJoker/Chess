public enum Tyyppi{ 
    K("K") {
      public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
        return true;
      }
    
  }
  , Q("Q") {
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
      return true;
      }

  }
  , T("T") {
  public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
    if (Xmista - Xmihin == 0 && Ymista - Ymihin != 0) { //yhden akselin suuntainen liike
      return true;
    }
    if (Xmista - Xmihin != 0 && Ymista - Ymihin == 0) { // ja toisen akselin
      return true;
    } 
    return false;
  }
    
  }, L("L") {
  public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
    if (Math.abs((Ymihin - Ymista)/(Xmihin - Xmista))== 1) {
      return true;
    }
    return false;
  }
    
  }, S("S") {
    boolean promootio;
    boolean ohesta;
    
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v,boolean b) { //b = onko siirretty
    if (v == Vari.M) {
      if (Xmihin - Xmista == 1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1)) { // syÃ¶nti: diagonaalinen siirto
        // mÃ¤Ã¤rÃ¤Ã¤ onSiirretty-attribuutin arvoksi true joka siirrolla. Haittaako?
        return true;
      }
      if (b == false) { // ensimmÃ¤inen siirto
        if ((Xmihin - Xmista == 2 || Xmihin - Xmista == 1) && Ymihin - Ymista == 0) {
          
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
       
        return true;
      }
      if (b == false) {
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
  
  }, R("R") {
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
      return true;
      }
  }, E(" ") {
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b) {
      return true;
      }
  };
  Tyyppi(String s) {
    this.symboli = s;
  }
  String symboli;
  public String annaSymboli() {return symboli;}
  
  public abstract  boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin,Vari v, boolean b);
}
