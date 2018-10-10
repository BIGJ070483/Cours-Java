
public class TypesEntiers { // ici ont voit le nom de la class qui commence par une majuscule puis une autre majuscule pour separer

	public static void main(String[] args) {
		
		int counter = 10;  				// int = integer , uniquement des nombres entiers
		counter ++ ;	  				// ++ signifie incrementer la variable c'est a dire +1
		System.out.println( counter );  //affiche le resultat de la variable modifiée par l'increment ++
		counter --;						// -- est le contraire du ++
		System.out.println( counter );  //affiche le resultat de la variable modifiée par l'increment --
		// régles pour les noms de variables: caractéres autorisés  = lettre , chiffre, _ , $
		
		int var2 = 100; 			// aucune erreur le nom de la variable est correcte
		int nom_complexe = 200; 	// ici pareil aucun probleme avec le _ // à éviter
		int nom$complexe = 300; 	//idem avec $						   // à éviter
		int nomélémentaire = 400; 	// aucun probleme avec des accents   // à éviter
		
		//int 2var = 0; // cela ne fonctionne pas si la variable commence par un chiffre, toujours commencer par une lettre
		
		int nomComplexe = 500; 		/* ici le nom d'une variable correct, 
									composé de 2 mots , 1er mot comment par une minuscule ,
									la majuscule sers de separateur pour chaque autre mots
									*/
		System.out.println( var2 + " - " + nom_complexe + " - " + nom$complexe +" - " + nomélémentaire + " - " + nomComplexe ); // resultat final
//___________________________________________________________________________________________________________________________________		
		// Les 4 types entiers
		
		//byte  => 1 octet => -128 à +127
		byte monOctet = 111;
		System.out.println( monOctet );
		
		//Short => 2 octets => -32768 à +32767
		short monShort = 30000;
		System.out.println(monShort);
		
		//int => 4 octets
		int monInt = 1_000_000_000; 
		System.out.println(monInt);
		
		//long => 8 octets
		long monLong = 10_000_000_000L; // avec la variable long bien mettre un l ou L a la fin du chiffre pour le typer
		System.out.println(monLong);
//___________________________________________________________________________________________________________________________________		
		// 4 bases en numerique
		int decimalValue = 10 ;		// 10 digits de 0 à 9
		System.out.println(decimalValue);
		
		int binaryValue = 0b101 ;	// valeur 5 exprimée en binaire  	2 digits 0 et 1
		System.out.println(binaryValue);
		
		int octalValue = 010 ;		// 8			8 digits 0 à 7
		System.out.println(octalValue);
		
		int hexadecimalValue = 0xff ; //valeur 255 exprimé en hexadecimal , sur 16 digits en tout 0à 9 et A à F
		System.out.println(hexadecimalValue);
//___________________________________________________________________________________________________________________________________
		// les opérateurs sur valeur entière : ++   -- 			 +   -   /   *   % 				 +=   -=   *=   /=   %=
		int a = 33 ;
		int b = 44 ; 
		int resultat = a - b ; 		//ont calcul le resultat des variables a et b par un operateur
		System.out.println(resultat);
		
		byte b1 = 100;
		byte b2 = 100;
		int total = b1 + b2 ; /* ATTENTION ici ont additionne 2 variable de type byte qui ont donc un maximum de 127 , 
								du moment que l'ont calcul 2 type de variable similaire cela donne comme resultat forcement un int*/
		System.out.println(total);
		
		int currentValue = 1 ;
		currentValue += 5 ; // ici ont ont le calcul est currentValue = currentValue + 5 , sous sa forme simplifée
		System.out.println(currentValue);
		
		/*
		int value2 = 3 ;
		int test = value2 / 0 ;
		System.out.println(test); // ici cela va poser probleme car le resultat de la variable test est impossible car ont ne peut pas diviser par 0
		*/
		
		}
}