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
    Nappula q1 = new Nappula(Vari.V,Tyyppi.Q);
    Nappula q2 = new Nappula(Vari.M),Tyyppi.Q;
    //Kuninkaat
    Nappula k1 = new Nappula(Vari.V,Tyyppi.K);
    Nappula k2= new Nappula(Vari.M,Tyyppi.K);
    //Tornit
    Nappula t1  = new Nappula(Vari.V,Tyyppi.T);
    Nappula t2  = new Nappula(Vari.V, Tyyppi.T);
    Nappula t3  = new Nappula(Vari.M, Tyyppi.T);
    Nappula t4  = new Nappula(Vari.M, Tyyppi.T);
    //Lähetit
    Nappula l1 = new Nappula(Vari.V, Tyyppi.L);
    Nappula l2 = new Nappula(Vari.V, Tyyppi.L);
    Nappula l3 = new Nappula(Vari.M, Tyyppi.L);
    Nappula l4 = new Nappula(Vari.M, Tyyppi.L);
    //Ratsut
    Nappula r1  =new Nappula(Vari.V,Tyyppi.R);
    Nappula r2  =new Nappula(Vari.V,Tyyppi.R);
    Nappula r3  =new Nappula(Vari.M, Tyyppi.R);
    Nappula r4  =new Nappula(Vari.M,Tyyppi R);
    //Sotilaat
    Nappula s1 new Nappula(Vari.V,Tyyppi.S);
    Nappula s2 new Nappula(Vari.V,Tyyppi.S);
    Nappula s3 new Nappula(Vari.V,Tyyppi.S);
    Nappula s4 new Nappula(Vari.V,Tyyppi.S);
    Nappula s5 new Nappula(Vari.V,Tyyppi.S);
    Nappula s6 new Nappula(Vari.V,Tyyppi.S);
    Nappula s7 new Nappula(Vari.V,Tyyppi.S);
    Nappula s8 new Nappula(Vari.V,Tyyppi.S);
    Nappula s9 new Nappula(Vari.M,Tyyppi.S);
    Nappula s10 new Nappula(Vari.M,Tyyppi.S);
    Nappula s11 new Nappula(Vari.M,Tyyppi.S);
    Nappula s12 new Nappula(Vari.M,Tyyppi.S);
    Nappula s13 new Nappula(Vari.M,Tyyppi.S);
    Nappula s14 new Nappula(Vari.M,Tyyppi.S);
    Nappula s15 new Nappula(Vari.M,Tyyppi.S);
    Nappula s16 new Nappula(Vari.M,Tyyppi.S);
    //Tyhjät
    Nappula e1 new Nappula(Vari.E,Tyyppi.E);
    Nappula e2 new Nappula(Vari.E,Tyyppi.E);
    Nappula e3 new Nappula(Vari.E,Tyyppi.E);
    Nappula e4 new Nappula(Vari.E,Tyyppi.E);
    Nappula e5 new Nappula(Vari.E,Tyyppi.E);
    Nappula e6 new Nappula(Vari.E,Tyyppi.E);
    Nappula e7 new Nappula(Vari.E,Tyyppi.E);
    Nappula e8 new Nappula(Vari.E,Tyyppi.E);
    Nappula e9 new Nappula(Vari.E,Tyyppi.E);
    Nappula e10 new Nappula(Vari.E,Tyyppi.E);
    Nappula e11 new Nappula(Vari.E,Tyyppi.E);
    Nappula e12 new Nappula(Vari.E,Tyyppi.E);
    Nappula e13 new Nappula(Vari.E,Tyyppi.E);
    Nappula e14 new Nappula(Vari.E,Tyyppi.E);
    Nappula e15 new Nappula(Vari.E,Tyyppi.E);
    Nappula e16 new Nappula(Vari.E,Tyyppi.E);
    Nappula e17 new Nappula(Vari.E,Tyyppi.E);
    Nappula e18 new Nappula(Vari.E,Tyyppi.E);
    Nappula e19 new Nappula(Vari.E,Tyyppi.E);
    Nappula e20 new Nappula(Vari.E,Tyyppi.E);
    Nappula e21 new Nappula(Vari.E,Tyyppi.E);
    Nappula e22 new Nappula(Vari.E,Tyyppi.E);
    Nappula e23 new Nappula(Vari.E,Tyyppi.E);
    Nappula e24 new Nappula(Vari.E,Tyyppi.E);
    Nappula e25 new Nappula(Vari.E,Tyyppi.E);
    Nappula e26 new Nappula(Vari.E,Tyyppi.E);
    Nappula e27 new Nappula(Vari.E,Tyyppi.E);
    Nappula e28 new Nappula(Vari.E,Tyyppi.E);
    Nappula e29 new Nappula(Vari.E,Tyyppi.E);
    Nappula e30 new Nappula(Vari.E,Tyyppi.E);
    Nappula e31 new Nappula(Vari.E,Tyyppi.E);
    Nappula e32 new Nappula(Vari.E,Tyyppi.E);


    
    

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
