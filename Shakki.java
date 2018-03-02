import java.util.*;
public class Shakki{
  public static void main(String[] args){
    Nappula[][] lauta = new Ruutu[8][8];
    Nappula[] sotilaat = new Sotilas[16];
    
    for (int i=0;i<16;i++) {
      if (i<8) {
        Nappula s = new Sotilas(Vari.M,Tyyppi.SOTILAS);
        sotilaat[i] = s;
      } else {
        Nappula s = new Sotilas(Vari.V,Tyyppi.SOTILAS);
        sotilaat[i] = s;
      }
    }
    
    Nappula q1 = new Nappula(Vari.V);
    Nappula q2 = new Nappula(Vari.M);
    
    Nappula k1 = new Kuningas(Vari.V);
    Nappula k2= new Kuningas(Vari.M);
    
    //torni
    Nappula t1  = new Nappula(Vari.V,Tyyppi.T);
    Nappula t2  = new Nappula(Vari.V,Tyyppi.T);
    Nappula t3  = new Nappula(Vari.M,Tyyppi.T);
    Nappula t4  = new Nappula(Vari.M,Tyyppi.T);
    lauta[0][0] = t4;
    lauta[0][7] = t3;
    lauta[7][0] = t2;
    lauta[7][7] = t1;
    
    Nappula l1 = new Lahetti(Vari.V);
    Nappula l2 = new Lahetti(Vari.V);
    Nappula l3 = new Lahetti(Vari.M);
    Nappula l4 = new Lahetti(Vari.M);
    
    Nappula r1  =new Ratsu(Vari.V);
    Nappula r2  =new Ratsu(Vari.V);
    Nappula r3  =new Ratsu(Vari.M);
    Nappula r4  =new Ratsu(Vari.M);
    
    
    //luodaan muutkin nappulat    
    //alustetaan lauta
    int sotilasCount = 0;
    for (int i =0;i<8;i++) {
      for (int j=0;j<8;j++) {
        //Tornit
        if(i==0&&j==0){
          Ruutu r = new Ruutu(i,j,t3);
          l[i][j] = r;
          continue;
        }
        if(i==0&&j==7){
          Ruutu r = new Ruutu(i,j,t4);
          lauta[i][j] = r;
          continue;
        }
        if(i==7&&j==0){
          Ruutu r = new Ruutu(i,j,t1);
          lauta[i][j] = r;
          continue;
        }
        if(i==7&&j==7){
          Ruutu r = new Ruutu(i,j,t2);
          lauta[i][j] = r;
          continue;
        }
        //Ratsut
        if(i==0&&j==1){
           Ruutu r = new Ruutu(i,j,r3);
          lauta[i][j] = r;
          continue;
        }
        if(i==0 && j==6){
          Ruutu r = new Ruutu(i,j,r4);
          lauta[i][j] = r;
          continue;
        }
        if(i==7&&j==1){
        Ruutu r = new Ruutu(i,j,r1);
          lauta[i][j] = r;
          continue;
        }
        if(i==7&&j==6){
          Ruutu r = new Ruutu(i,j,r2);
          lauta[i][j] = r;
          continue;
        }
        //Lähetit
        if(i==0&&j==
        //kuningattaret
        if(i==7&&j==3) {
          Ruutu r = new Ruutu(i,j,q2);
          lauta[i][j] = r;
          continue;
        }
        if(i==0&&j==3) {
          Ruutu r = new Ruutu(i,j,q1);
          lauta[i][j] = r;
          continue;
        }
        //sotilaat
        if((i==1)||(i==6)) {
          Ruutu r = new Ruutu(i,j,sotilaat[sotilasCount]);
          sotilasCount++;
          lauta[i][j] = r;
          continue;
        }
        Ruutu r = new Ruutu(i,j);
        lauta[i][j] = r;
      }
    }
    System.out.println(lauta[0][3].toString());
    print(lauta);
  }
  
  static void print(Ruutu[][] lauta) {
    for (int i=0;i<8;i++) {
      for(int j=0;j<8;j++) {
        System.out.print(lauta[i][j].toString());
      }
      System.out.println();
    }
  System.out.println(" ");
  }
}


  }
}
