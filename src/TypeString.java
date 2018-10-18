
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
		String remplacement = message.replace("String", "Bidule"); 
		System.out.println(remplacement);
		
	}
}