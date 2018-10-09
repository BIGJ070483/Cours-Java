
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
		
		//
		
	}

}
