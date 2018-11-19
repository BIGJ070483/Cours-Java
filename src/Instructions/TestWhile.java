package Instructions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestWhile {
	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		
//ici c'est la meme chose que le for mais en plus simple
// ont dit que tant que (while) i est inferieur (<) à 10
//ont execute la commande
//puis ont l'incremente ( à la difference du for ou ont l'incremente dans l'instruction)
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Incrementation terminée\n");
//exemple de while ou l'ont ne sait pas quand va ce terminer sauf si ont a un boolean
		boolean mustExit = false;
		while(mustExit == false) {
			System.out.print("Veuillez saisir une commande :");
			String command = keyboard.readLine();
			System.out.println("Traitement de la commande "+command);
			if(command.equals("exit")) mustExit = true;
		}
		System.out.println("Bye bye");
	}

}
