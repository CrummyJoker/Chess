import java.util.*;
public class Shakki{
  public static void main(String[] args){

    
    //Kuningattaret
    Nappula q1 = new Nappula(Vari.V,Tyyppi.Q,7,3);
    Nappula q2 = new Nappula(Vari.M,Tyyppi.Q,0,3);
    //Kuninkaat
    Nappula k1 = new Nappula(Vari.V,Tyyppi.K,7,4);
    Nappula k2 = new Nappula(Vari.M,Tyyppi.K,0,4);
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
    Nappula r1  = new Nappula(Vari.V,Tyyppi.R,7,1);
    Nappula r2  = new Nappula(Vari.V,Tyyppi.R,7,6);
    Nappula r3  = new Nappula(Vari.M, Tyyppi.R,0,1);
    Nappula r4  = new Nappula(Vari.M,Tyyppi R,0,6);
    //Sotilaat
    Nappula s1 = new Nappula(Vari.V,Tyyppi.S,6,0);
    Nappula s2 = new Nappula(Vari.V,Tyyppi.S,6,1);
    Nappula s3 = new Nappula(Vari.V,Tyyppi.S,6,2);
    Nappula s4 = new Nappula(Vari.V,Tyyppi.S,6,3);
    Nappula s5 = new Nappula(Vari.V,Tyyppi.S,6,4);
    Nappula s6 = new Nappula(Vari.V,Tyyppi.S,6,5);
    Nappula s7 = new Nappula(Vari.V,Tyyppi.S,6,6);
    Nappula s8 = new Nappula(Vari.V,Tyyppi.S,6,7);
    Nappula s9 = new Nappula(Vari.M,Tyyppi.S,1,0);
    Nappula s10 = new Nappula(Vari.M,Tyyppi.S,1,1);
    Nappula s11 = new Nappula(Vari.M,Tyyppi.S,1,2);
    Nappula s12 = new Nappula(Vari.M,Tyyppi.S,1,3);
    Nappula s13 = new Nappula(Vari.M,Tyyppi.S,1,4);
    Nappula s14 = new Nappula(Vari.M,Tyyppi.S,1,5);
    Nappula s15 = new Nappula(Vari.M,Tyyppi.S,1,6);
    Nappula s16 = new Nappula(Vari.M,Tyyppi.S,1,7);
    //Tyhjät
    Nappula e1 = new Nappula(Vari.E,Tyyppi.E,2,0);
    Nappula e2 = new Nappula(Vari.E,Tyyppi.E,2,1);
    Nappula e3 = new Nappula(Vari.E,Tyyppi.E,2,2);
    Nappula e4 = new Nappula(Vari.E,Tyyppi.E,2,3);
    Nappula e5 = new Nappula(Vari.E,Tyyppi.E,2,4);
    Nappula e6 = new Nappula(Vari.E,Tyyppi.E,2,5);
    Nappula e7 = new Nappula(Vari.E,Tyyppi.E,2,6);
    Nappula e8 = new Nappula(Vari.E,Tyyppi.E,2,7);
    Nappula e9 = new Nappula(Vari.E,Tyyppi.E,3,0);
    Nappula e10 = new Nappula(Vari.E,Tyyppi.E,3,1);
    Nappula e11 = new Nappula(Vari.E,Tyyppi.E,3,2);
    Nappula e12 = new Nappula(Vari.E,Tyyppi.E,3,3);
    Nappula e13 = new Nappula(Vari.E,Tyyppi.E,3,4);
    Nappula e14 = new Nappula(Vari.E,Tyyppi.E,3,5);
    Nappula e15 = new Nappula(Vari.E,Tyyppi.E,3,6);
    Nappula e16 = new Nappula(Vari.E,Tyyppi.E,3,7);
    Nappula e17 = new Nappula(Vari.E,Tyyppi.E,4,0);
    Nappula e18 = new Nappula(Vari.E,Tyyppi.E,4,1);
    Nappula e19 = new Nappula(Vari.E,Tyyppi.E,4,2);
    Nappula e20 = new Nappula(Vari.E,Tyyppi.E,4,3);
    Nappula e21 = new Nappula(Vari.E,Tyyppi.E,4,4);
    Nappula e22 = new Nappula(Vari.E,Tyyppi.E,4,5);
    Nappula e23 = new Nappula(Vari.E,Tyyppi.E,4,6);
    Nappula e24 = new Nappula(Vari.E,Tyyppi.E,4,7);
    Nappula e25 = new Nappula(Vari.E,Tyyppi.E,5,0);
    Nappula e26 = new Nappula(Vari.E,Tyyppi.E,5,1);
    Nappula e27 = new Nappula(Vari.E,Tyyppi.E,5,2);
    Nappula e28 = new Nappula(Vari.E,Tyyppi.E,5,3);
    Nappula e29 = new Nappula(Vari.E,Tyyppi.E,5,4);
    Nappula e30 = new Nappula(Vari.E,Tyyppi.E,5,5);
    Nappula e31 = new Nappula(Vari.E,Tyyppi.E,5,6);
    Nappula e32 = new Nappula(Vari.E,Tyyppi.E,5,7);


    
    //lauta 
    Nappula[][] lauta = new Nappula[8][8];
    Nappula[0][0]=t1; Nappula[0][1]=r3; Nappula[0][2]=l3; Nappula[0][3]=q2;
    Nappula[0][4]=k2; Nappula[0][5]=l4; Nappula[0][6]=r4; Nappula[0][7]=t4;
    Nappula[1][0]=s9; Nappula[1][1]=s10; Nappula[1][2]=s11; Nappula[1][3]=s12;
    Nappula[1][4]=s13; Nappula[1][5]=s14; Nappula[1][6]=s15; Nappula[1][7]=s16;
    Nappula[2][0]=e1; Nappula[2][1]=e2; Nappula[2][2]=e3; Nappula[2][3]=e4;
    Nappula[2][4]=e5; Nappula[2][5]=e6; Nappula[2][6]=e7; Nappula[2][7]=e8;
    Nappula[3][0]=e9; Nappula[3][1]=e10; Nappula[3][2]=e11; Nappula[3][3]=e12;
    Nappula[3][4]=e13; Nappula[3][5]=e14; Nappula[3][6]=e15; Nappula[3][7]=e16;
    Nappula[4][0]=e17; Nappula[4][1]=e18; Nappula[4][2]=e19; Nappula[4][3]=e20;
    Nappula[4][4]=e21; Nappula[4][5]=e22; Nappula[4][6]=e23; Nappula[4][7]=e24;
    Nappula[5][0]=e25; Nappula[5][1]=e26; Nappula[5][2]=e27; Nappula[5][3]=e28;
    Nappula[5][4]=e29; Nappula[5][5]=e30; Nappula[5][6]=e31; Nappula[5][7]=e32;
    Nappula[6][0]=s1; Nappula[6][1]=s2; Nappula[6][2]=s3; Nappula[6][3]=s4;
    Nappula[6][4]=s5; Nappula[6][5]=s6; Nappula[6][6]=s7; Nappula[6][7]=s8;
    Nappula[7][0]=t1; Nappula[7][1]=r1; Nappula[7][2]=l1; Nappula[7][3]=q1;
    Nappula[7][4]=k1; Nappula[7][5]=l2; Nappula[7][6]=r2; Nappula[7][7]=t2;

    
    



  }
  public static void siirra(Nappula n,Nappula m) {
     int nx = n.annaX();
     int ny = n.annaY();
     int mx = m.annaX();
     int my = m.annaY();
     Nappula temp = m;
     if (n.onkoSiirtoLaillinen()) {
       if (m.annaTyyppi()==E) { 
         n.asetaKoo(mx,my);
         temp.asetaKoo(nx,ny);
       } else {
         n.asetaKoo(mx,my);
         temp.asetaKoo(nx,ny);
         temp.asetaTyyppi(Tyyppi.E);
     } else {
      System.out.println("Siirto laiton!");
     }
  }
  public void printtaaLauta(){
    int sum = 0;
    String[][] a = new String[12][12]
    for(Nappula a : lauta){
       String[a.annaY()][a.annaX()] = a.toString();
    }
    for (int i = 0; i<a.length;i++){
      for (int j = 0; j<a.length;j++){
        if(a[i][j] == null){
          a[i][j]=" ";
        }
      }
    }
        for (int k=0;k<=7;k++){
      a[k][9] = ""+(k+1);
    }
    a[9][0] = "A ";
    a[9][1] = "B ";
    a[9][2] = "C ";
    a[9][3] = "D ";
    a[9][4] = "E ";
    a[9][5] = "F ";
    a[9][6] = "G ";
    a[9][7] = "H ";
        
    
    for (int p = 0; p<a.length;p++){
      for (int q = 0; q<a.length;q++){
        System.out.print(a[p][q] + " ");
      }
    }
      System.out.println();
    }
  
    
