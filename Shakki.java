import java.io.*;
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
    lauta[0][0]=t1; lauta[0][1]=r3; lauta[0][2]=l3; lauta[0][3]=q2;
    lauta[0][4]=k2; lauta[0][5]=l4; lauta[0][6]=r4; lauta[0][7]=t4;
    lauta[1][0]=s9; lauta[1][1]=s10; lauta[1][2]=s11; lauta[1][3]=s12;
    lauta[1][4]=s13; lauta[1][5]=s14; lauta[1][6]=s15; lauta[1][7]=s16;
    lauta[2][0]=e1; lauta[2][1]=e2; lauta[2][2]=e3; lauta[2][3]=e4;
    lauta[2][4]=e5; lauta[2][5]=e6; lauta[2][6]=e7; lauta[2][7]=e8;
    lauta[3][0]=e9; lauta[3][1]=e10; lauta[3][2]=e11; lauta[3][3]=e12;
    lauta[3][4]=e13; lauta[3][5]=e14; lauta[3][6]=e15; lauta[3][7]=e16;
    lauta[4][0]=e17; lauta[4][1]=e18; lauta[4][2]=e19; lauta[4][3]=e20;
    lauta[4][4]=e21; lauta[4][5]=e22; lauta[4][6]=e23; lauta[4][7]=e24;
    lauta[5][0]=e25; lauta[5][1]=e26; lauta[5][2]=e27; lauta[5][3]=e28;
    lauta[5][4]=e29; lauta[5][5]=e30; lauta[5][6]=e31; lauta[5][7]=e32;
    lauta[6][0]=s1; lauta[6][1]=s2; lauta[6][2]=s3; lauta[6][3]=s4;
    lauta[6][4]=s5; lauta[6][5]=s6; lauta[6][6]=s7; lauta[6][7]=s8;
    lauta[7][0]=t1; lauta[7][1]=r1; lauta[7][2]=l1; lauta[7][3]=q1;
    lauta[7][4]=k1; lauta[7][5]=l2; lauta[7][6]=r2; lauta[7][7]=t2;

    
    



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
  public void printtaaLauta(Nappula[][] lauta){
    int sum = 0;
    String[][] a = new String[12][12]
    for(int i = 0; i<8;i++){
      for (int j = 0; j<8;j++){
       a[i][j] = lauta[i][j].toString();
      }
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
    a[9][0] = " A   ";
    a[9][1] = " B   ";
    a[9][2] = " C   ";
    a[9][3] = " D   ";
    a[9][4] = " E   ";
    a[9][5] = " F   ";
    a[9][6] = " G   ";
    a[9][7] = " H ";
        
    
    for (int p = 0; p<a.length;p++){
      for (int q = 0; q<a.length;q++){
        System.out.print(a[p][q] + " ");
      }
      System.out.println();
    }
  }
    //Tallennus
  
public void tallenna(){
   
   FileOutputStream fos = new FileOutputStream("shakki.ser");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
    
    oos.writeObject(q1); oos.writeObject(q2);

oos.writeObject(k1); oos.writeObject(k2);

oos.writeObject(t1); oos.writeObject(t2);
oos.writeObject(t3); oos.writeObject(t4);

oos.writeObject(r1); oos.writeObject(r2);
oos.writeObject(r3); oos.writeObject(r4);

oos.writeObject(l1); oos.writeObject(l2);
oos.writeObject(l3); oos.writeObject(l4);

oos.writeObject(s1); oos.writeObject(s2); oos.writeObject(s3); oos.writeObject(s4);
oos.writeObject(s5); oos.writeObject(s6); oos.writeObject(s7); oos.writeObject(s8);
oos.writeObject(s9); oos.writeObject(s10); oos.writeObject(s11); oos.writeObject(s12);
oos.writeObject(s13); oos.writeObject(s14); oos.writeObject(s15); oos.writeObject(s16);

oos.writeObject(e1); oos.writeObject(e2); oos.writeObject(e3); oos.writeObject(e4);
oos.writeObject(e5); oos.writeObject(e6); oos.writeObject(e7); oos.writeObject(e8);
oos.writeObject(e9); oos.writeObject(e10); oos.writeObject(e11); oos.writeObject(e12);
oos.writeObject(e13); oos.writeObject(e14); oos.writeObject(e15); oos.writeObject(e16);
oos.writeObject(e17); oos.writeObject(e18); oos.writeObject(e19); oos.writeObject(e20);
oos.writeObject(e21); oos.writeObject(e22); oos.writeObject(e23); oos.writeObject(e24);
oos.writeObject(e25); oos.writeObject(e26); oos.writeObject(e27); oos.writeObject(e28);
oos.writeObject(e29); oos.writeObject(e30); oos.writeObject(e31); oos.writeObject(e32);
    
    


   oos.close();
 }
public void lataaTallennus(){
   FileInputStream fis = new FileInputStream("shakki.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
    
    q1 = (Nappula) ois.readObject(); q2 = (Nappula) ois.readObject();
    
    k1 = (Nappula) ois.readObject(); k2 = (Nappula) ois.readObject();
  
    t1 = (Nappula) ois.readObject(); t2 = (Nappula) ois.readObject();
    t3 = (Nappula) ois.readObject(); t4 = (Nappula) ois.readObject();
    
    r1 = (Nappula) ois.readObject(); r2 = (Nappula) ois.readObject();
    r3 = (Nappula) ois.readObject(); r4 = (Nappula) ois.readObject();
  
    l1 = (Nappula) ois.readObject(); l2 = (Nappula) ois.readObject();
    l3 = (Nappula) ois.readObject(); l4 = (Nappula) ois.readObject();
   
    s1 = (Nappula) ois.readObject(); s2 = (Nappula) ois.readObject(); s3 = (Nappula) ois.readObject(); 
    s4 = (Nappula) ois.readObject(); s5 = (Nappula) ois.readObject(); s6 = (Nappula) ois.readObject(); 
    s7 = (Nappula) ois.readObject(); s8 = (Nappula) ois.readObject(); s9 = (Nappula) ois.readObject(); 
    s10 = (Nappula) ois.readObject(); s11 = (Nappula) ois.readObject(); s12 = (Nappula) ois.readObject();
    s13 = (Nappula) ois.readObject(); s14 = (Nappula) ois.readObject(); s15 = (Nappula) ois.readObject(); 
    s16 = (Nappula) ois.readObject();

    e1 = (Nappula) ois.readObject(); e2 = (Nappula) ois.readObject(); e3 = (Nappula) ois.readObject();
    e4 = (Nappula) ois.readObject(); e5 = (Nappula) ois.readObject(); e6 = (Nappula) ois.readObject();
    e7 = (Nappula) ois.readObject(); e8 = (Nappula) ois.readObject(); e9 = (Nappula) ois.readObject();
    e10 = (Nappula) ois.readObject(); e11 = (Nappula) ois.readObject(); e12 = (Nappula) ois.readObject();
    e13 = (Nappula) ois.readObject(); e14 = (Nappula) ois.readObject(); e15 = (Nappula) ois.readObject();
    e16 = (Nappula) ois.readObject(); e17 = (Nappula) ois.readObject(); e18 = (Nappula) ois.readObject();
    e19 = (Nappula) ois.readObject(); e20 = (Nappula) ois.readObject(); e21 = (Nappula) ois.readObject();
    e22 = (Nappula) ois.readObject(); e23 = (Nappula) ois.readObject(); e24 = (Nappula) ois.readObject();
    e25 = (Nappula) ois.readObject(); e26 = (Nappula) ois.readObject(); e27 = (Nappula) ois.readObject();
    e28 = (Nappula) ois.readObject(); e29 = (Nappula) ois.readObject(); e30 = (Nappula) ois.readObject();
    e31 = (Nappula) ois.readObject(); e32 = (Nappula) ois.readObject();


    ois.close();

  }

  }
 }

}
  
    
