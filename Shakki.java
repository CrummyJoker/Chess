import java.util.*;
public class Shakki{
  public static void main(String[] args){
    Ruutu[][] Lauta = new Ruutu[8][8];
    Sotilas[] sotilaat = new Sotilas[16];
    
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
    Kuningatar q2 = new Kuningatar(Vari.M);
    
    Kuningas k1 = new Kuningas(Vari.V);
    Kuningas k2= new Kuningas(Vari.M);
    
    Torni t1  = new Torni(Vari.V);
    Torni t2  = new Torni(Vari.V);
    Torni t3  = new Torni(Vari.M);
    Torni t4  = new Torni(Vari.M);
    
    Lahetti l1 = new Lahetti(Vari.V);
    Lahetti l2 = new Lahetti(Vari.V);
    Lahetti l3 = new Lahetti(Vari.M);
    Lahetti l4 = new Lahetti(Vari.M);
    
    Ratsu r1  =new Ratsu(Vari.V);
    Ratsu r2  =new Ratsu(Vari.V);
    Ratsu r3  =new Ratsu(Vari.M);
    Ratsu r4  =new Ratsu(Vari.M);
    
    
    //luodaan muutkin nappulat    
    //alustetaan lauta
    int sotilasCount = 0;
    for (int i =0;i<8;i++) {
      for (int j=0;j<8;j++) {
        //Tornit
        if(i==0&&j==0){
          Ruutu r = new Ruutu(i,j,t3);
          lauta[i][j] = r;
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
        if(i==1&&j==0){
           Ruutu r = new Ruutu(i,j,r3);
          lauta[i][j] = r;
          continue;
        }
        if(i==6 && j==0){
          Ruutu r = new Ruutu(i,j,r4);
          lauta[i][j] = r;
          continue;
        }
        if(i==1&&j==7){
        Ruutu r = new Ruutu(i,j,r1);
          lauta[i][j] = r;
          continue;
        }
        if(i==6&&j==7){
          Ruutu r = new Ruutu(i,j,r2);
          lauta[i][j] = r;
          continue;
        }
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
