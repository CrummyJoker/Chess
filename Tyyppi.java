public enum Tyyppi{ 
    K("K") {
    
  }
  , Q("Q") {
    
  }
  , T("T") {
    
  }, L("L") {
    
  }, S("S") {
    boolean promootio;
    boolean ohesta;
    
    public boolean onkoSiirtoLaillinen(int Xmista, int Ymista, int Xmihin, int Ymihin) {
    if (v == Vari.M) {
      if (Xmihin - Xmista == 1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1)) { // syönti: diagonaalinen siirto
        siirra(); // määrää onSiirretty-attribuutin arvoksi true joka siirrolla. Haittaako?
        return true;
      }
      if (siirretty == false) { // ensimmäinen siirto
        if ((Xmihin - Xmista == 2 || Xmihin - Xmista == 1) && Ymihin - Ymista == 0) {
          siirra();
          return true; //vaihda sotilaan onSiirretty-attribuutin arvoksi true ja palauta true
        }
      } else { // ei ensimmäinen siirto
        if (Xmihin - Xmista == 1 && Ymihin - Ymista == 0) {
          return true;
        }
      }
    } else { // sama kuin edellä valkeille nappuloille
      if (Xmihin - Xmista == -1 && (Ymihin - Ymista == -1 || Ymihin - Ymista == 1))
      { // syönti
        siirra();  
        return true;
      }
      if (siirretty == false) {
        if ((Xmihin - Xmista == -2 || Xmihin - Xmista == -1) && Ymihin - Ymista == 0) {
          siirra();
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
    
  }, E(" ") {
    
  };
  Tyyppi(String s) {
    this.symboli = s;
  }
  String symboli;
  public String annaSymboli() {return symboli;}
}
