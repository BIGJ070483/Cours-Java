
public class TypeString {

	public static void main(String[] args) {
		String message = "Ceci est une phrase (String) en unicode (\u03c0)";
		System.out.println(message);
			
		// Des operateurs permettent de manipuler vos chaines de caracteres
		String start = "Start";
		start = start + " After";		//attention la concaténation de String peut couter chere.
		start += " End";				//Les classes StrinBuffer et StringBuilder peuvent etre plus efficaces ( prochain tuto)
		System.out.println(start);
		
		//La classe String (son nom commence par une majuscule) propose un certain nombre de methodes
		//Attention : une chaine de caracteres est immuable. il est impossible de changer son contenu.
		//			  Mais on peut produire une nouvelle chaine de caracteres a partir d'une autre
		String upper = message.toUpperCase();
		System.out.println(upper);
		String lower = message.toLowerCase();
		System.out.println(lower);
		System.out.println(message);
		
		String subPart = message.substring(22,29);
		System.out.println(subPart + "!");
		
		//ci dessous , ont genere un nouveau tableau dans lequel ont va lister mot par mot
		//ont voit que dans la variable message la fonction split s arrete a chaque espace dans la variable parts
		// et le for va lister un a un les changement du tableau de la variable parts via la variable str
		//ont ne modifie donc aucune variable ont ne fait qu'en creer
		String [] parts = message.split(" ");
		for (String str : parts) {
			System.out.print(str + " - ");
		}
		System.out.println();
		
		//ont va modifier dans la variable message , via la fonction replace
		// le mot String par le mot Bidule
		//par contre cela ne modifie toujours pas la variable d'origine ont continue d'en creer de nouvelle
		// en utilisant de base la variable message
		String remplacement = message.replace("String", "Bidule"); 
		System.out.println(remplacement);
		
		// Pour transformer des chaines de caracteres en nombre et des nombres en chaines -----------------------
		String strValue = "123"; //creation de la chaine de caractere strValue
		int value = Integer.parseInt(strValue); // ont creer la variable value dans laquelle ont copie le string converti en int de strValue
		strValue = "3.141592654"; // ici strValue est toujours en type String ont lui assigne la valeur de pi
		double value2 = Double.parseDouble(strValue); // ont converti srtValue(string) en double value2
		System.out.println(value +" - "+ value2); //ont affiche les variables converties
		
		String finalString = value+""; /*ici ont crée finalString en type chaine de caractere ( String) 
											via value qui est un integer et une chaine de caractere vide cela converti automatiquement
											value + chaine de caractere en chaine de caractere*/ 
		finalString += " ";				// ici ont ajoute un espace apres value
		finalString += Double.toString(value2); //ici ont ajoute a finalString la valeur de value2 qu'on converti en chaine de caractere
		System.out.println(finalString); //ont affiche les variables converties
		
		String strFinal2 = String.format("%05d [%05.2f]", value, value2); /*ont se sert de String.format qui nous permet de definir ce que 
																	l'ont veut afficher dans le resultat, ont pourrait tres bien definir
																	un nombre ou un format precis via la class String.format
																	05d veut dire qu'ont veut en tout et que si il y a du vide ont utilise
																	le 0 pour le remplir
																	idem avec le 05.2f ont defini que l'ont veut 5 caractere uniquement
																	EN TOUT virgule comprise donc et que le vide est rempli par des 0*/
		System.out.println(strFinal2);
		//================================================================================================
		//Attention aux comparaisons de chaines de caractères
		
		String str1 = "toto";
		String str2 = "tata";
		String str3 = "toto";
		System.out.println(str1 == str2); // comme ça ont pourrait croire que ça marche mais il y a une optimisation sur les contantes.
		System.out.println(str1 == str3); // ce qui est comparé se sont les adresses des deux objets en mémoire.
		
		String half = "to";
		String str4 = half+half;
		System.out.println(str1 + " - " + str4 + " => " + (str1==str4)); //les pointeurs en mémoires sont des adresses differentes
		
		
	}
}









