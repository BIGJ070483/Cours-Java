
public class TypeCharacter {

	public static void main(String[] args) {
		// Attention entre chaine de caracteres (") et caractere (')
		String theStr = "une chaine de caracteres"; //un ensemble de caracteres
		char theChar = 'a'; 						//un unique caractere
		System.out.println(theStr +" vs "+theChar);

		// La syntaxe est herit�e de C => on retrouve les meme sequences pour certains caracteres speciaux
		char retourALaLigne = '\n'; //ici le \n signifie "new line" ce qui va faire un retour a la ligne (cf nom de variable)
		char tabulation = '\t'; //\t signifie tabulation
		System.out.println("BEGIN"+ retourALaLigne + "MIDDLE" + tabulation + "END");
		
		//En Java, on utilise UNICODE et non ASCII (American Standard Coding for Information Interchange).
		//En ASCII (ou d�riv� : ISO-8859-1), 1 caractere = 1 octet en memoire => 256 caracteres au maximum
		//En UNICODE, 1 caractere = 2 octets en m�moire => on peut utiliser des milliers de carateres.
		//Pour info, regardez ce site : https://unicode-table.com./fr
		
		char piMaj = '\u03a0';  //ici on declare UN caractere en hexadecimale (grace au \ u ) qui est la lettre pi majuscule
		//char piMin = '\u03c0'; //idem ici mais avec le pi minuscule
		char piMin = 960;		//codification du pi minuscule en decimal
		System.out.println(piMaj+" - "+piMin );
		
		// Des methodes statiques vous sont proposées pour tester vos caracteres.
		boolean isDigit = Character.isDigit(theChar);				//ont verifie si la variable theChar est un nombre
		System.out.println(isDigit);
		boolean isLetter = Character.isLetter(piMin);				//ont verifie si la variable piMin est une lettre
		System.out.println(isLetter);
		boolean isUpperCaseLetter = Character.isUpperCase(piMin);	//ont verifie si la variable piMin est en majuscule
		System.out.println(isUpperCaseLetter);
		
	}
}
