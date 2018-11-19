package Instructions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSwitch {
	
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	

	public static void main(String[] args) throws Exception{
		
		int value = (int) (Math.random() * 10); // 0 < value < 9

		switch(value) {							//switch permet de prendre une variable et de definir des cas selon la valeur de cette variable uniquement sur des entiers ne marche pas sur des doubles
			case 0:
				System.out.println("Zéro");
				break;							//break permet de limité l'action de case uniquement a cet instruction, sinon il passerait directement a la suivant exemple:
												// Zero, un , deux , autre;    si le case 0 ests activé sans break derriere cela executera automatiquement les suivants
			case 1:
				System.out.println("Un");
				break;
			case 2:
				System.out.println("Deux");
				break;
			default:							//defaut defini que quoi qu'il ce passe au niveau du switch cela executera quoi qu'il ce passe cette instruction
				System.out.println("Autre");
				break;
		}
		System.out.println("Veuillez saisir une commande :");
		String cmd = keyboard.readLine();
		switch(cmd) {
			case "ls" :
				System.out.println("On imagine un ls");
				break;
			case "clear":
				System.out.println("On imagine un clear");
				break;
			default:
				System.out.println("Commande inconnue");
			
		}
		
	}

}
