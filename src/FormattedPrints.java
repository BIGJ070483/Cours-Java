
public class FormattedPrints {

	public static void main(String[] args) {
		
		int num = 8;
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
		
		
	}

}
