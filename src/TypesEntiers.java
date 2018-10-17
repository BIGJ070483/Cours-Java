
public class TypesEntiers { // ici ont voit le nom de la class qui commence par une majuscule puis une autre majuscule pour separer

	public static void main(String[] args) {
		
		int counter = 10;  				// int = integer , uniquement des nombres entiers
		counter ++ ;	  				// ++ signifie incrementer la variable c'est a dire +1
		System.out.println( counter );  //affiche le resultat de la variable modifi�e par l'increment ++
		counter --;						// -- est le contraire du ++
		System.out.println( counter );  //affiche le resultat de la variable modifi�e par l'increment --
		// r�gles pour les noms de variables: caract�res autoris�s  = lettre , chiffre, _ , $
		
		int var2 = 100; 			// aucune erreur le nom de la variable est correcte
		int nom_complexe = 200; 	// ici pareil aucun probleme avec le _ // � �viter
		int nom$complexe = 300; 	//idem avec $						   // � �viter
		int nomélémentaire = 400; 	// aucun probleme avec des accents   // � �viter
		
		//int 2var = 0; // cela ne fonctionne pas si la variable commence par un chiffre, toujours commencer par une lettre
		
		int nomComplexe = 500; 		/* ici le nom d'une variable correct, 
									compos� de 2 mots , 1er mot comment par une minuscule ,
									la majuscule sers de separateur pour chaque autre mots
									*/
		System.out.println( var2 + " - " + nom_complexe + " - " + nom$complexe +" - " + nomélémentaire + " - " + nomComplexe ); // resultat final
//___________________________________________________________________________________________________________________________________		
		// Les 4 types entiers
		
		//byte  => 1 octet => -128 � +127
		byte monOctet = 111;
		System.out.println( monOctet );
		
		//Short => 2 octets => -32768 � +32767
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
		int decimalValue = 10 ;		// 10 digits de 0 � 9
		System.out.println(decimalValue);
		
		int binaryValue = 0b101 ;	// valeur 5 exprim�e en binaire  	2 digits 0 et 1
		System.out.println(binaryValue);
		
		int octalValue = 010 ;		// 8			8 digits 0 � 7
		System.out.println(octalValue);
		
		int hexadecimalValue = 0xff ; //valeur 255 exprim� en hexadecimal , sur 16 digits en tout 0� 9 et A � F
		System.out.println(hexadecimalValue);
//___________________________________________________________________________________________________________________________________
		// les op�rateurs sur valeur enti�re : ++   -- 			 +   -   /   *   % 				 +=   -=   *=   /=   %=
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
		currentValue += 5 ; // ici ont ont le calcul est currentValue = currentValue + 5 , sous sa forme simplif�e
		System.out.println(currentValue);
		
		int firstValue = 11;
        int secondValue = 3;
        int div = firstValue / secondValue;
        int rest = firstValue % secondValue;
    
        int computedValue = div * secondValue + rest;
    
        System.out.println( "11 / 3 == " + div );                      // Affiche 3
        System.out.println( "11 % 3 == " + rest );                     // Affiche 2
        System.out.println( "computedValue == " + computedValue );     // Affiche 11

		
		/*
		int value2 = 3 ;
		int test = value2 / 0 ;
		System.out.println(test); // ici cela va poser probleme car le resultat de la variable test est impossible car ont ne peut pas diviser par 0
		*/
//___________________________________________________________________________________________________________________________________
		//passer d'un type a un autre
        byte c = 10;
        short s = c;        // Autoris�, car taille byte < taille short
        System.out.println( s );    // Affiche 10
        
        long l = 10;        // Ici, on demande explicitement de r�duire la taille de la donn�e
        int i = (int) l;    // de 8 octets vers 4 octets, via l'op�rateur de transtypage (int) 
        System.out.println( i );    // Affiche 10
        
        i = 200000;
        s = (short) i;              // Attention, il va y avoir une perte d'information !
        System.out.println( s );    // Affiche 3392, car un short ne peut pas d�passer 32767
//__________________________________________________________________________________________________________________________________
        //les differentes bases numeriques
        int       binaryValue1 = 0b10;     // == 2
        int        octalValue1 = 010;      // == 8
        int      decimalValue1 = 10;
        int  hexadecimalValue1 = 0x10;     // == 16
         
        System.out.println( binaryValue1 );
        System.out.println( octalValue1 );
        System.out.println( decimalValue1 );
        System.out.println( hexadecimalValue1 );

        hexadecimalValue = 0xff;          // On change la valeur : 255 en d�cimal
        System.out.println( hexadecimalValue );
        
//__________________________________________________________________________________________________________________________________
        //Operateurs de comparaisons
        int numerator1 = 1;
        int denominator1 = 3;
        
        int numerator2 = 2;
        int denominator2 = 1;  
 
        int leftPart = numerator1 * denominator2;
        int rightPart = denominator1 * numerator2;
        
        if ( leftPart == rightPart ) {
            System.out.println( "Les fractions sont �quivalentes" );
        } else if ( leftPart < rightPart ) {
            System.out.println( "La premi�re fraction est plus petite" );
        } else {
            System.out.println( "La premi�re fraction est plus grande" );
        }
		}
}