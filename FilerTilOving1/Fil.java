/**
 * 
 */
package no.hib.dat102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import no.hib.dat102.adt.*;

/**
 * @author Ole Olsen
 * 
 */
public class Fil {

 private static String SKILLE = "#";

 /**
  * @param filnavn
  * @return Referansen til CD-arkivet
  * @throws java.io.IOException
  */
 public CDarkivADT lesFraFil(String filnavn)  {

  CDarkivADT cda = null;

  try {
   // // 1 - FileReader
   FileReader ansFil = new FileReader(filnavn);

   // 2 - BufferedReader
   BufferedReader innfil = new BufferedReader(ansFil);

   // 3 - Leser den første posten som er antall info-poster
   String linje = innfil.readLine();
   int n = Integer.parseInt(linje);

   // Oppretter CDarkiv
   cda = new CDarkiv(n);

   // 4 - Les postene, en hel post om gangen
    for (int i = 0; i < n; i++) {
    String post = innfil.readLine();
    String[] felt = post.split(SKILLE);
    int nr = Integer.parseInt(felt[0]);
    String artist = felt[1];
    String tittel = felt[2];
    int aar = Integer.parseInt(felt[3]);
    Sjanger sjanger = felt[4]; //Eventuelt lagret som heltall
	...Må så konvertere til enum
	
    String plselskap = felt[5];
    ...
    CD cd = new CD(nr, artist, tittel, år, sjang, plselskap);
    
    cda.leggTil(cd);    
   }

   // 4 - Lukk filen
   innfil.close();

  } 
  catch (FileNotFoundException unntak) {//arver fra IOException må stå først
                                        // hvis ikke vil unntaket for IOException skygge
   System.out.println("Finner ikke filen " + filnavn);
   System.exit(1);
  } 
  catch (IOException e) {
   System.out.println("Feil ved lesing av fil: " + e);
   System.exit(2);
  }
  
  return cda;
 }

 public void skrivTilFil(CDarkivADT cdarkiv, String filnavn, boolean utvid){
  //Fyll ut...

 }

}// class
