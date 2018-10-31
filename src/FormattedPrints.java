
public class FormattedPrints {

	public static void main(String[] args) {
		
		int num = 25;
		int den = 11;
		System.out.println("[" + num + "/" + den + "]");
		System.out.printf("[%d/%d]\n", num, den);
		
		String message = String.format("[%d/%d]\n", num, den);
		System.out.print(message);
		
		
		//types entiers
		
		/* via le %05d je formate la sortie de ma valeur, ici 0 est le remplisseur de vide, le 5 est le nombre de caracteres
		 * ici 5 au total et le d defini que c'est un decimal(entier)
		 * sauf pour la derniere ligne ou vu que l'entier que nous appelons est deja superieur a 5 digits donc pas de 0 supplementaire
		 */
		System.out.printf(">%5d<\n",num); 
		System.out.printf(">%05d<\n",num); 
		System.out.printf(">%05d<\n",1_000_000_000); 
		System.out.printf(">%,d<\n",1_000_000_000);  // ici la virgule sers a valider la separation de _
		
		System.out.printf("%d %o %x\n", num, num , num); // %d = entier %o = octal %x = hexadecimale
		System.out.printf(">%08x<\n",num); // ont peu grouper meme en hexadecimale( ou en octal)
		
		//types floattants
		
		System.out.printf("%f\n", Math.PI);
		System.out.printf("%5.2f\n", Math.PI);
		System.out.printf("%05.2f\n", Math.PI);
		System.out.printf("%,11.2f\n", 10000.256); //attention no
	}

}
