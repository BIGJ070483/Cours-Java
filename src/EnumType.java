import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnumType {	
	
    // Pour permettre la saisie à partir de la console
    static BufferedReader keyboard = new BufferedReader( new InputStreamReader( System.in ) );
    
    
    public static void main(String[] args) throws Exception {
		
		Feu feu = Feu.VERT;
		
		System.out.println("Que voulez-vous faire(passer, attendre) :");
		String action = keyboard.readLine();
		
	}

}
