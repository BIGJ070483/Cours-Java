
public class TypeString {

	public static void main(String[] args) {
		String message = "Ceci est une phrase(String) en unicode (\u03c0)";
		System.out.println(message);
			
		// Des operateurs permettent de manipuler vos chaines de caracteres
		String start = "Start";
		start = start + " After";		//attention la concaténation de String peut couter chere.
		start += " End";				//Les classes StrinBuffer et StringBuilder peuvent etre plus efficaces ( prochain tuto)
		System.out.println(start);
		
		
	}

}
