import java.beans.DefaultPersistenceDelegate;

public class OperadoresRelacionais {
	
	 public static void main (String[]args) {
		 
     Boolean tresMaiorQueDois = 3 <= 3 ;
	 System.out.println("3 + 2 ? " + tresMaiorQueDois);	
	 
	 Boolean tresMenorQueDois = 3 < 2 ;
	 System.out.println("3 < 2? " + tresMenorQueDois);
	 
	 Boolean tresMaiorQueTres = 3 > 3 ;
	 System.out.println("3 > 3? " + tresMaiorQueTres);
	 
	 Boolean tresMaiorouIgualATres = 3 >= 3 ;
	 System.out.println("3 >= 3? " + tresMaiorouIgualATres);
	 
	 Boolean tresMenorOuIgualATres = 3 <= 3 ;
	 System.out.println("3 <= 2? " + tresMenorOuIgualATres);
	 
	 Boolean DoisIgualADois = 2 == 2 ;
	 System.out.println("2 == 2? " + DoisIgualADois);
	 
	 Boolean DoisDiferenteDeDois = 2 != 2 ;
	 System.out.println("2 != 2? " + DoisDiferenteDeDois);
	 
	 Integer quatro = 4 ;
	 Boolean quatroMaiorQueiQuatro = quatro > quatro;
	 System.out.println("quatro > quatro? " + quatroMaiorQueiQuatro);
	 
	 
	 Boolean quatroMaiorouIgualAQuatro = quatro >= quatro;
	 System.out.println("quatro >= quatro? " + quatroMaiorouIgualAQuatro);
	 
	 
	 Integer cinco = 5 ;
	 Boolean cincoIgualACinco = cinco.equals(cinco);
	 System.out.println("cinco = cinco? " + cincoIgualACinco);
	 
	 
	 Integer seis = 6 ;
	 Boolean seisMaiorQueSeis = seis.equals(seis);
	 System.out.println("seis = seis? " + seisMaiorQueSeis);
	 
	 Integer centoVinteOito = 128;
	 Integer centoVinteOito02 = 128;
	 Boolean centoVinteOitoIgualcentoVinteOito02 = centoVinteOito.equals(centoVinteOito02);
	 System.out.println("centoVinteOito == centoVinteOito02?" + centoVinteOitoIgualcentoVinteOito02);
	 
	


	 
	} 

}
