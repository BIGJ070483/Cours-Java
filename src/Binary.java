
public class Binary {

	public static void main(String[] args) {
		
		for(int i=0; i<16; i++) { //ici ont parcours les 16 premiere valeur donc de 0 à 15
			String str = Integer.toBinaryString(i); //ici ont cherche a calculé une chaine de caractères qui sera la representation binaire de i
			while( str.length() < 4 ) str = "0" + str; /*ici ont fait "tant que" la longueur de la variable str est inferieur a 4 
														  ont ajoute 0 devant pour le formater a 4 chiffres*/
			System.out.println(str);
		}
		
		int value1 = 0b10101010 ; //ici ont exprime un chiffre en binaire avec /_\ groupement _ uniquement disponible a partir de java1.7
		int value2 = 0b00001111 ;
		System.out.println(value1 + value2);
		
		//operateur  & (AND)   | (OR)    ^ (XOR)    ~ (NOT)
		System.out.println("NOT" + Integer.toBinaryString(~value1)); // ici ont affiche en binaire  l'inverse des bytes value1 grace a ~ qui veut dire NOT
		System.out.println("AND" + Integer.toBinaryString(value1 & value2)); /*ici and (&) permet de comparer les couples de bytes et 
																		de n'afficher que si il y a bien 2 chiffres egaux 
																		example 1 et 1  affichera 1 pour dire vrai c'est egal 
																		et 0 et 1 pas egaux et donc il affiche 0 faux ce n'est pas egal
																		ne pas oublier que si le resultat n'est que 0 au debut du chiffre 
																		cela n'affichera rien */ 
		System.out.println("OR" + Integer.toBinaryString(value1 | value2)); //ici l operateur affichera 1 (vrai)si l'un des 2 chiffres est 1
		System.out.println("XOR" + Integer.toBinaryString(value1 ^ value2));
	}
}