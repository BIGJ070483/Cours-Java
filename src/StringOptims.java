import java.util.concurrent.TimeUnit;

public class StringOptims {

	private static final int LOOP_COUNT = 10_000_000;
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); /* currentTimeMillis affiche ou defini l'heure en millisecondes*/

		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0 ; i<LOOP_COUNT; i++){			//ici ont boucle un nombre de fois LOOP_COUNT pour utiliser du temps machine
			String fullMessage = "Begin - ";
			fullMessage += part1;
			fullMessage += " - ";
			fullMessage += part2;
			fullMessage += " - ";
			fullMessage += part3;
			fullMessage += " - ";
			fullMessage += part4;
			fullMessage += " - End";
			//System.out.println( fullMessage);	
			}
			// petit modif de ma part par rapport au cours, je me suis amusé a convertir le temps d'execution des millisecondes en secondes
			long end = System.currentTimeMillis(); 
			long millis = end-begin;
			long secondes= TimeUnit.MILLISECONDS.toSeconds(millis);
			System.out.println( "Duration: " + (secondes)+ "s"); /* ont calcul la difference en milliseconde entre les variables end et 
																		begin afin de definir le temps d'execution des commandes*/
	}

}
