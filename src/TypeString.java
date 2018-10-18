
public class TypeString {

	public static void main(String[] args) {
		String message = "Ceci est une phrase(String) en unicode (\u03c0)";
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
		
	}

}
