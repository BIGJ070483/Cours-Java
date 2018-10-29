import java.util.concurrent.TimeUnit; //le fait d'utiliser une class de java l'import automatiquement apparement , à verifier


@SuppressWarnings("unused") // ont supprime les avertissements d'objet inutilisés
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
			//System.out.println( fullMessage + " String");	
			}
			// petit modif de ma part par rapport au cours, je me suis amusé a convertir le temps d'execution des millisecondes en secondes
			long end = System.currentTimeMillis(); 
			long millis = end-begin;
			long secondes= TimeUnit.MILLISECONDS.toSeconds(millis);
			System.out.println( "Duration for String: " + (secondes)+ "s ou " +(millis)+"ms"); /* ont calcul la difference en milliseconde 
																					entre les variables end et 
																					begin afin de definir le temps 
																					d'execution des commandes*/
			optimsThreadSafe();
			optimsThreadUnsafe();
	}

	public static void optimsThreadSafe() {
		long beginBuffer = System.currentTimeMillis(); /* currentTimeMillis affiche ou defini l'heure en millisecondes*/

		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0 ; i<LOOP_COUNT; i++){			//ici ont boucle un nombre de fois LOOP_COUNT pour utiliser du temps machine
			StringBuffer buffer = new StringBuffer("Begin - ");
			buffer.append( part1 );
			buffer.append( " - " );
			buffer.append( part2 );
			buffer.append( " - " );
			buffer.append( part3 );
			buffer.append( " - " );
			buffer.append( part4 );
			buffer.append( " - End");
			String fullMessage = buffer.toString();
			//System.out.println( fullMessage + "StringBuffer");	
			}
			// petit modif de ma part par rapport au cours, je me suis amusé a convertir le temps d'execution des millisecondes en secondes
			long endBuffer = System.currentTimeMillis(); 
			long millisBuffer = endBuffer-beginBuffer;
			long secondesBuffer= TimeUnit.MILLISECONDS.toSeconds(millisBuffer);
			System.out.println( "Duration for StringBuffer: " + (secondesBuffer)+ "s ou " +(millisBuffer)+"ms"); /* ont calcul la difference en milliseconde 
																						entre les variables end et 
																						begin afin de definir le temps 
																						d'execution des commandes*/
			
	}
	
	public static void optimsThreadUnsafe() {
		long beginBuilder = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0 ; i<LOOP_COUNT; i++){	
			StringBuilder builder = new StringBuilder ("Begin - ");
			builder.append( part1 );
			builder.append( " - " );
			builder.append( part2 );
			builder.append( " - " );
			builder.append( part3 );
			builder.append( " - " );
			builder.append( part4 );
			builder.append( " - End");
			String fullMessage = builder.toString();
			//System.out.println(fullMessage);
			
			long endBuilder = System.currentTimeMillis(); 
			long millisBuilder = endBuilder-beginBuilder;
			long secondesBuilder= TimeUnit.MILLISECONDS.toSeconds(millisBuilder);
			System.out.println( "Duration for StringBuilder: " + (secondesBuilder)+ "s ou " +(millisBuilder)+"ms");
		}
	}
}