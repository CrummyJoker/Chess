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
  
  }, R("R") {
    
  }, E(" ") {
    
  };
  Tyyppi(String s) {
    this.symboli = s;
  }
  String symboli;
  public String annaSymboli() {return symboli;}
}
