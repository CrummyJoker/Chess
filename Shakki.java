import java.util.*;
public class Shakki{
  public static void main(String[] args){
    Nappula[][] Lauta = new Ruutu[8][8];
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
    
    //Kuningattaret
    Nappula q1 = new Nappula(Vari.V,Tyyppi.Q,7,3);
    Nappula q2 = new Nappula(Vari.M,Tyyppi.Q,0,3);
    //Kuninkaat
    Nappula k1 = new Nappula(Vari.V,Tyyppi.K,7,4);
    Nappula k2= new Nappula(Vari.M,Tyyppi.K,0,4);
    //Tornit
    Nappula t1  = new Nappula(Vari.V,Tyyppi.T,7,0);
    Nappula t2  = new Nappula(Vari.V, Tyyppi.T,7,7);
    Nappula t3  = new Nappula(Vari.M, Tyyppi.T,0,0);
    Nappula t4  = new Nappula(Vari.M, Tyyppi.T,0,7);
    //Lähetit
    Nappula l1 = new Nappula(Vari.V, Tyyppi.L,7,2);
    Nappula l2 = new Nappula(Vari.V, Tyyppi.L,7,5);
    Nappula l3 = new Nappula(Vari.M, Tyyppi.L,0,2);
    Nappula l4 = new Nappula(Vari.M, Tyyppi.L,0,5);
    //Ratsut
    Nappula r1  =new Nappula(Vari.V,Tyyppi.R,7,1);
    Nappula r2  =new Nappula(Vari.V,Tyyppi.R,7,6);
    Nappula r3  =new Nappula(Vari.M, Tyyppi.R,0,1);
    Nappula r4  =new Nappula(Vari.M,Tyyppi R,0,6);
    //Sotilaat
    Nappula s1 new Nappula(Vari.V,Tyyppi.S,6,0);
    Nappula s2 new Nappula(Vari.V,Tyyppi.S,6,1);
    Nappula s3 new Nappula(Vari.V,Tyyppi.S,6,2);
    Nappula s4 new Nappula(Vari.V,Tyyppi.S,6,3);
    Nappula s5 new Nappula(Vari.V,Tyyppi.S,6,4);
    Nappula s6 new Nappula(Vari.V,Tyyppi.S,6,5);
    Nappula s7 new Nappula(Vari.V,Tyyppi.S,6,6);
    Nappula s8 new Nappula(Vari.V,Tyyppi.S,6,7);
    Nappula s9 new Nappula(Vari.M,Tyyppi.S,1,0);
    Nappula s10 new Nappula(Vari.M,Tyyppi.S,1,1);
    Nappula s11 new Nappula(Vari.M,Tyyppi.S,1,2);
    Nappula s12 new Nappula(Vari.M,Tyyppi.S,1,3);
    Nappula s13 new Nappula(Vari.M,Tyyppi.S,1,4);
    Nappula s14 new Nappula(Vari.M,Tyyppi.S,1,5);
    Nappula s15 new Nappula(Vari.M,Tyyppi.S,1,6);
    Nappula s16 new Nappula(Vari.M,Tyyppi.S,1,7);
    //Tyhjät
    Nappula e1 new Nappula(Vari.E,Tyyppi.E,2,0);
    Nappula e2 new Nappula(Vari.E,Tyyppi.E,2,1);
    Nappula e3 new Nappula(Vari.E,Tyyppi.E,2,2);
    Nappula e4 new Nappula(Vari.E,Tyyppi.E,2,3);
    Nappula e5 new Nappula(Vari.E,Tyyppi.E,2,4);
    Nappula e6 new Nappula(Vari.E,Tyyppi.E,2,5);
    Nappula e7 new Nappula(Vari.E,Tyyppi.E,2,6);
    Nappula e8 new Nappula(Vari.E,Tyyppi.E,2,7);
    Nappula e9 new Nappula(Vari.E,Tyyppi.E,3,0);
    Nappula e10 new Nappula(Vari.E,Tyyppi.E,3,1);
    Nappula e11 new Nappula(Vari.E,Tyyppi.E,3,2);
    Nappula e12 new Nappula(Vari.E,Tyyppi.E,3,3);
    Nappula e13 new Nappula(Vari.E,Tyyppi.E,3,4);
    Nappula e14 new Nappula(Vari.E,Tyyppi.E,3,5);
    Nappula e15 new Nappula(Vari.E,Tyyppi.E,3,6);
    Nappula e16 new Nappula(Vari.E,Tyyppi.E,3,7);
    Nappula e17 new Nappula(Vari.E,Tyyppi.E,4,0);
    Nappula e18 new Nappula(Vari.E,Tyyppi.E,4,1);
    Nappula e19 new Nappula(Vari.E,Tyyppi.E,4,2);
    Nappula e20 new Nappula(Vari.E,Tyyppi.E,4,3);
    Nappula e21 new Nappula(Vari.E,Tyyppi.E,4,4);
    Nappula e22 new Nappula(Vari.E,Tyyppi.E,4,5);
    Nappula e23 new Nappula(Vari.E,Tyyppi.E,4,6);
    Nappula e24 new Nappula(Vari.E,Tyyppi.E,4,7);
    Nappula e25 new Nappula(Vari.E,Tyyppi.E,5,0);
    Nappula e26 new Nappula(Vari.E,Tyyppi.E,5,1);
    Nappula e27 new Nappula(Vari.E,Tyyppi.E,5,2);
    Nappula e28 new Nappula(Vari.E,Tyyppi.E,5,3);
    Nappula e29 new Nappula(Vari.E,Tyyppi.E,5,4);
    Nappula e30 new Nappula(Vari.E,Tyyppi.E,5,5);
    Nappula e31 new Nappula(Vari.E,Tyyppi.E,5,6);
    Nappula e32 new Nappula(Vari.E,Tyyppi.E,5,7);


    
    

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
