import java.io.*;
import java.util.*;
// PELIN PERUSLOGIIKKA TOIMII
//ohestalyönti puuttuu, kuninkaan matittaminen puuttuu (peli loppuu nyt kuninkaan syömiseen), sotilaan promootio puuttuu
public class Shakki{
  public static void main(String[] args){

    int siirrot = 0; //toteutuneiden siirtojen määrä
    
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
    Nappula r4  = new Nappula(Vari.M,Tyyppi.R,0,6);
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


    
    //lauta //ruudussa [0][0] oli aiemmin t1, ruutuun korjattu t3
    Nappula[][] lauta = new Nappula[8][8];
    lauta[0][0]=t3; lauta[0][1]=r3; lauta[0][2]=l3; lauta[0][3]=q2;
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

    
Shakki.printtaaLauta(lauta);
    
    Scanner sc = new Scanner(System.in);
    boolean peliKaynnissa = true;
    int nx;
    int ny;
    int mx;
    int my;
    //char jatka;
    
    //try-catchit nappaavat käyttäjän kirjoittamat virhearvot. Exceptionit pitäisi saada samaan lohkoon, ks. kommentti alla
    while (peliKaynnissa) {
      System.out.println("Tervetuloa pelaamaan shakkia!");
      System.out.println("Jos haluat ladata pelin, kirjoita 'LG'.");
      System.out.println("Muutoin paina Enter");
      String aloitus = sc.nextLine();
      if (aloitus == "LG";){
        lauta = lataaTallennus();
      }
      System.out.println("Aloitetaan peli");
      System.out.println("Jos haluat lopettaa, kirjoita'Q'");
      System.out.println("Siirra nappulaa : ");
      String n = sc.nextLine();
      String m = sc.nextLine();
      if (n =="Q"||m=="Q"){
          System.out.println("Tallennetaanko peli (Y/Mitä vain)?");
          String tallennanna = sc.nextLine();
          if (tallennanna == "Y"){
            tallenna();
          }
          
          peliKaynnissa = false;
        }
      char nc = n.charAt(0);
      char mc = m.charAt(0);
      try {
      nx = Integer.parseInt(n.substring(1)) -1;
      mx = Integer.parseInt(m.substring(1)) -1;
      ny = annaY(nc);
      my = annaY(mc);
      } catch (ArrayIndexOutOfBoundsException e) {// (ArrayIndexOutOfBoundsException|NumberFormatException e) ei jostain syystä toiminut
        System.out.println("Syötit ruudun, jota ei ole olemassa.\n");
        continue;
      } catch (NumberFormatException e) {
        System.out.println("Syötit ruudun, jota ei ole olemassa.\n");
        continue;
      }
      Nappula temp1 = lauta[nx][ny];
      Nappula temp2 = lauta[mx][my];
      if (siirra(temp1,temp2,lauta, siirrot)==true) {
        siirrot++; // vuoron suorituksen jälkeen kasvata laskurin lukemaa yhdellä
      } else {
        System.out.println("Pelissä tehty siirtoja : " + siirrot);
        continue;
      }
      Shakki.printtaaLauta(lauta);
      System.out.println("Pelissä tehty siirtoja : " + siirrot);
    
      if (k1.annaOnkoSyoty() || k2.annaOnkoSyoty()) {
        System.out.println("Peli päättyi.");
        peliKaynnissa = false;
      } else {
        peliKaynnissa = true;
      }                      
    }
    sc.close();
  }
  
  //muuntaa y-koordinaatin käyttäjän syöttämästä kirjaimesta indeksinumeroksi
  public static int annaY(char c) throws ArrayIndexOutOfBoundsException{
    if (c == 'A'||c == 'a') {
      return 0;
    } else if (c == 'B'||c=='b') {
      return 1;
    } else if (c == 'C'||c=='c') {
      return 2;
    } else if (c == 'D'||c=='d') {
      return 3;
    } else if (c=='E'||c=='e') {
      return 4;
    } else if (c=='F'||c=='f') {
      return 5;
    } else if (c=='G'||c=='g') {
      return 6;
    } else if(c=='H'||c=='h') { // F ja f vaihdettu H:ksi ja h:ksi
      return 7;
    } return -1; //palauttaa 2:n sijaan -1, jos käyttäjä syöttää virheellisen arvon
  }
  //n=siirrettävä nappula, m=nappula, jonka paikalle n siirretään
  public static boolean siirra(Nappula n,Nappula m, Nappula[][]lauta, int vuoroja) { // palauttaa true, jos siirto onnistui! Ominaisuutta voi käyttää laskurissa
     int nx = n.annaX();
     int ny = n.annaY();
     int mx = m.annaX();
     int my = m.annaY();
     //Tyyppi te = n.annaTyyppi();
     int vuorot = vuoroja;
     Nappula temp = m;
     
     if ((n.annaVari()==Vari.M && vuorot % 2 != 0) || (n.annaVari()==Vari.V && vuorot % 2 == 0)) { //siirretaanko omaa nappulaa
       if (n.annaTyyppi().onkoSiirtoLaillinen(nx, mx, ny, my, n.annaVari(), n.annaOnkoSiirretty())) { // onko siirto siirtyvalle nappulalle laillinen
         if (voikoSiirtya(n,m,lauta) && voikoRuutuunSiirtaa(n,m)) { // voiko kohderuutuun siirtaa ja onko linjalla tiella muita nappuloita
           if (n.annaTyyppi()==Tyyppi.K && onkoKohdeUhattu(n,m,lauta)) { // jos siirrettava nappula kuningas, uhkaako vastapuoli kohderuutua
             System.out.println("Uhattuun ruutuun ei voi siirtää!");
             return false;
           } else {
             n.asetaOnkoSiirretty(true);
             if (m.annaTyyppi()==Tyyppi.E) { // nappula siirtyy tyhjään ruutuun
               n.asetaKoo(mx,my);
               lauta[mx][my] = n;
               temp.asetaKoo(nx,ny);
               lauta[nx][ny] = temp;
               //n.asetaKoo(mx,my);
               //m.asetaKoo(nx,ny);
               return true;
             } else { // nappula syo toisen nappulan
               n.asetaKoo(mx,my);
               lauta[mx][my] = n;
               temp.asetaOnkoSyoty(true);
               lauta[nx][ny] = new Nappula(Vari.E,Tyyppi.E,nx,ny);
               return true;
             }
           }
         } 
       }
     }
     System.out.println("Siirto laiton!");
    return false;
  }
  
  // jos kohderuudussa on oma nappula, return false. Else return true
  public static boolean voikoRuutuunSiirtaa(Nappula n, Nappula m) {
    if (m.annaTyyppi()==Tyyppi.E) {
      return true;
    }
    if (m.annaVari() != n.annaVari()) {
      return true;
    }
    return false;
  }
  // Seuraava metodi pitka ja sekava
  //testaa, onko linjalla tiellä muita nappuloita
  //AO: onkoSiirtoLaillinen()==true
  public static boolean voikoSiirtya(Nappula n, Nappula m, Nappula[][]lauta){
    int alkuX = 0;
    int alkuY = 0;
    int loppuX = 0;
    int loppuY = 0;
    // jos nappula on kuningatar, lähetti tai torni:
    if (n.annaTyyppi()==Tyyppi.T || n.annaTyyppi()==Tyyppi.L || n.annaTyyppi()==Tyyppi.Q){
      if (m.annaY() == n.annaY() && m.annaX() != n.annaX()) { //siirtyy vain x-akselin suhteen
        if (m.annaX() - n.annaX() > 0) { 
          loppuX = m.annaX();
          alkuX = n.annaX();
        } else if (m.annaX() - n.annaX() < 0){ 
          loppuX = n.annaX();
          alkuX = m.annaX();
        }
        for (int i = alkuX +1; i<loppuX; i++) {
          if ((lauta[i][n.annaY()]).annaTyyppi() != Tyyppi.E) {
            return false;
          }
        }
        return true;
      }
      else if (m.annaY() != n.annaY() && m.annaX() == n.annaX()) {
        if (m.annaY() - n.annaY() > 0) {
          loppuY = m.annaY();
          alkuY = n.annaY();
        } if (m.annaY() - n.annaY() < 0){
          loppuY = n.annaY();
          alkuY = m.annaY();
        }
        for (int i = alkuY+1; i<loppuY; i++) { //siirtyy vain y-akselin suhteen
          if ((lauta[n.annaX()][i]).annaTyyppi() != Tyyppi.E) {
            return false;
          }
        }
        return true;
      }
       //siirtyy diagonaalilla. 0,0 ja 0,7 mustat tornit. Kun x ja y pienenee, ok, kun x pienenee ja y suurenee, laskee mitä sattuu.
      int yKerr = 0;
      if (m.annaY() != n.annaY() && m.annaX() != n.annaX()){
        
        } if (m.annaY() - n.annaY() > 0) { // siirtyvän nappulan ruudun y-koordinaatti pienempi kuin kohderuudun
          yKerr = 1;
        } else if (m.annaY() - n.annaY() < 0) { // siirtyvän nappulan ruudun y-koordinaatti suurempi kuin kohderuudun
          yKerr = -1;
        }
        if (m.annaX() - n.annaX() > 0) { 
          for (int i=n.annaX()+1, j=n.annaY()+ yKerr; i<m.annaX(); i++, j+=1*yKerr) { // x:ää kasvatettaessa
            System.out.print("x = " + i);
            System.out.println(" ja y = " + j);
            if ((lauta[i][j]).annaTyyppi() != Tyyppi.E) {
              return false;
            }
          }
        } else {
          for (int i=n.annaX()-1, j=n.annaY()+ yKerr; i>m.annaX(); i--, j+=1*yKerr) { // x:ää pienennettäessä
            System.out.print("x = " + i);
            System.out.println(" ja y = " + j);
            if ((lauta[i][j]).annaTyyppi() != Tyyppi.E) {
              return false;
            }
          }
        }
        return true;
      }
    
    // sotilaalle
    if (n.annaTyyppi()==Tyyppi.S) { 
      if (n.annaX() != m.annaX() && n.annaY() != m.annaY()) {
        if (m.annaTyyppi()==Tyyppi.E) { //jos liikkuu vinosti ja kohderuutu tyhjä, palauta false
          return false;
        }
      } else { // liikkuu suoraan, jos kohderuudussa on nappula (ei väliä, kumpaa varia), palauta false
        if (m.annaTyyppi() != Tyyppi.E) {
          return false;
        }
      }
      return true;
    }
    if (n.annaTyyppi()==Tyyppi.K || n.annaTyyppi()==Tyyppi.R) {
      return true;
    }
    return false;
  }
      
  //onkoUhattu():boolean Jos laudalla sellainen vastustajan nappula, joka voi tulevalla vuorolla syödä
  // nyt siirtyvän nappulan ruudusta, johon se on parhaillaan siirtymässä, palauta true.
  // m = kohderuutu, johon nappula n on siirtymässä
  // u = potentiaalisesti kohderuutua uhkaava nappula, uhattava = siirtyvä nappula kohderuudussa (nappulalla kohderuudun indeksit)
  // metodissa bugi: jos nyt siirtyvä nappula n estää uhkaavaa nappulaa u siirtymästä ollessaan nykyisessä ruudussaan, 
  // voikoSiirtya-metodi palauttaa truen sijaan false.
  
  //metodilla typera nimi
  public static boolean onkoKohdeUhattu(Nappula siirtyva, Nappula kohde, Nappula[][]lauta){
    Nappula uhattava = new Nappula(siirtyva.annaVari(), siirtyva.annaTyyppi(), kohde.annaX(), kohde.annaY());
    Nappula u;
    for (int i=0; i<8; i++){
      for (int j=0; j<8; j++){
        u = lauta[i][j]; 
        if ((i==uhattava.annaX() && j==uhattava.annaY()) || (i==u.annaX() && j==u.annaY())) {
          continue; // nappula ei uhkaa itseään eikä nappulaa voi uhata tyhjä ruutu, josta se siirtyi edellisellä siirrolla
        }
        if (u.annaTyyppi()!= Tyyppi.E && u.annaVari()!= uhattava.annaVari()) { //ruudussa on nappula, joka on eri värinen kuin uhattava: voi uhata
          if (u.annaTyyppi().onkoSiirtoLaillinen(u.annaX(), uhattava.annaX(), u.annaY(), uhattava.annaY(), u.annaVari(), u.annaOnkoSiirretty())) {
            if (voikoSiirtya(u,uhattava,lauta) && voikoRuutuunSiirtaa(u,uhattava)) { 
              return true;
            }
          }
        }
      }
    }
    return false;
  }


  public static void printtaaLauta(Nappula[][] lauta){
    String[][] a = new String[12][12];
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
    a[9][0] = " A  ";
    a[9][1] = " B  ";
    a[9][2] = " C  ";
    a[9][3] = " D  ";
    a[9][4] = " E  ";
    a[9][5] = " F  ";
    a[9][6] = " G  ";
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
   oos.writeObject(lauta);

   oos.close();
 }
    
    //Lataa
public Nappula[][] lataaTallennus(){
   FileInputStream fis = new FileInputStream("shakki.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   lauta = (Nappula[][]) ois.readObject();
   ois.close();

   return lauta;
  }
}
