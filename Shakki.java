import java.util.*;
public class Shakki{
  public static void main(String[] args){
    Ruutu[][] Lauta = new Ruutu[8][8];
    Sotilas[] sotilaat = new Sotilas[16];
    Kuningatar[] kuningattaret = new Kuningatar[2];
    
    for (int i=0;i<16;i++) {
      if (i<8) {
        Sotilas s = new Sotilas(Vari.M);
        sotilaat[i] = s;
      } else {
        Sotilas s = new Sotilas(Vari.V);
        sotilaat[i] = s;
      }
    }
    
    Kuningatar q1 = new Kuningatar(Vari.V);
    kuningattaret[0] = q1;
    Kuningatar q2 = new Kuningatar(Vari.M);
    kuningattaret[1] = q2;
    Kuningas k1 = new Kuningas(Vari.V);
    Kuningas k2= new Kuningas(Vari.M);
    
    //luodaan muutkin nappulat
    
    //alustetaan lauta
    int sotilasCount = 0;
    for (int i =0;i<8;i++) {
      for (int j=0;j<8;j++) {
        //kuningattaret
        if(i==7&&j==3) {
          Ruutu r = new Ruutu(i,j,kuningattaret[0]);
          lauta[i][j] = r;
          continue;
        }
        if(i==0&&j==3) {
          Ruutu r = new Ruutu(i,j,kuningattaret[1]);
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
