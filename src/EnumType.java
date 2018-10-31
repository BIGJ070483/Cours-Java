import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnumType {	
	
    // Pour permettre la saisie à partir de la console
    static BufferedReader keyboard = new BufferedReader( new InputStreamReader( System.in ) );
    
    
    public static void main(String[] args) throws Exception {
		
		Feu feu = Feu.ORANGE;
		
		System.out.print("Que voulez-vous faire(passer, attendre) :");
		String action = keyboard.readLine();
		
		if (action.equals("passer")) {	// nb ont mets equals ici car faire == permet juste de verifier les emplacements memoires
			if(feu != Feu.VERT) {
				System.out.println("Vous ne pouvez pas passer, car le feu n'est pas vert");
			} else {
				System.out.println("Bonne route");
			}
		} else if (action.equals("attendre")) {
			if(feu == Feu.VERT) {
				System.out.println("Vous devez passer, les autres attendent derrière vous");
			} else {
				System.out.println("Bonne initiative");
			}

		} else {
			System.out.println("Commande inconnue");
		}
	}

}
