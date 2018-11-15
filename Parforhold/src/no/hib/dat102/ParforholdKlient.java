package no.hib.dat102;

public class ParforholdKlient {  
public static void main(String[] args) {
    Par<String> strPar = new Par<String>("Ole", "Kari");   
    Par<Integer> intPar = new Par<Integer>(2017, 2018);
    
    System.out.println(strPar);
    String maksStreng = strPar.maks();
    System.out.printf("største %s%n",maksStreng);        
    //--------------------------------------
    System.out.println(intPar);
    int maksHeltall = intPar.maks();
    System.out.printf("største %d%n",maksHeltall);      
  }
}

