
public class Binary {

	public static void main(String[] args) {
		
		for(int i=0; i<16; i++) { //ici ont parcours les 16 premiere valeur donc de 0 à 15
			String str = Integer.toBinaryString(i); //ici ont cherche a calculé une chaine de caractères qui sera la representation binaire de i
			while( str.length() < 4 ) str = "0" + str; /*ici ont fait "tant que" la longueur de la variable str est inferieur a 4 
														  ont ajoute 0 devant pour le formater a 4 chiffres*/
			System.out.println(str);
		}
		
		int value1 = 0b10101010 ; //ici ont exprime un chiffre en binaire ( 170 ) avec /_\ groupement _ uniquement disponible a partir de java1.7
		int value2 = 0b00001111 ; // ici le binaire vaut 15
		System.out.println(value1 + value2);
		
		System.out.println("==============================================");
		//operateur  & (AND)   | (OR)    ^ (XOR)    ~ (NOT)
		System.out.println("NOT " + Integer.toBinaryString(~value1)); // ici ont affiche en binaire  l'inverse des bytes value1 grace a ~ qui veut dire NOT
		System.out.println("AND " + Integer.toBinaryString(value1 & value2)); /*ici and (&) permet de comparer les couples de bytes et 
																		de n'afficher que si il y a bien 2 chiffres egaux 
																		example 1 et 1  affichera 1 pour dire vrai c'est egal 
																		et 0 et 1 pas egaux et donc il affiche 0 faux ce n'est pas egal
																		ne pas oublier que si le resultat n'est que 0 au debut du chiffre 
																		cela n'affichera rien */ 
		System.out.println("OR " + Integer.toBinaryString(value1 | value2)); //ici l operateur affichera 1 (vrai)si l'un des 2 chiffres est 1
		System.out.println("XOR " + Integer.toBinaryString(value1 ^ value2)); /*ici l 'operateur va mettre 1 si il y a uniquement 1 seul 1 dans le couple de byte
																				si il y a deux 1 il affichera 0 */
		System.out.println("==============================================");
		// << (left shift) 		>> (right shift)
		// ici on va decale les bytes a droit ou a gauche, ce qui aura pour incidence de ou multiplier le resultat ou le deviser 
		System.out.println("<< " + Integer.toBinaryString(value2 << 2) + " [" + value2 + " -> " + (value2 << 2) + "]" );
		System.out.println(">> " + Integer.toBinaryString(value2 >> 2) + " [" + value2 + " -> " + (value2 >> 2) + "]" );
		
		System.out.println("==============================================");
		// &= |= ^= >>= <<=
		value1 <<= 2; //cela veut dire value1 = value1 << 2 ce qui veut dire qu'il multiplie value1 par 2 puis le resultat par 2
		System.out.println( "<<=  - " + Integer.toBinaryString( value1 ) );
	
		int test = 3 ;
		test <<= 4;
		System.out.println(test);
	}
}