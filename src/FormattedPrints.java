import java.io.File;
import java.util.Date;

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
		System.out.printf("%,11.2f\n", 10000.256); //attention le float a arrondi le chiffre apres la virgule ont avait 10000.256 
													//ont arrondi donc a la dizaine ce qui donne 10000.26
		System.out.printf("%e\n", Math.PI); //%e exprime le nombre avec son exposant 
		
		//types character et string
		System.out.printf("%c - %s\n", 'z', "zorro");
		System.out.printf(">%10s<\n", "toto");
		System.out.printf(">%-10s<\n", "toto"); // ici le caractere - defini l'alignement par la gauche au lieu de droite
		System.out.printf(">%10s< %%\n", "toto"); //%% indique que l'ont veut afficher le caractere %
		
		
		//autres types
		System.out.printf("%b \n", true);
		System.out.printf("%h \n", new Date()); //ont visualise l'adresse memoire de la date
		System.out.printf("%tF %tT\n", new Date(), new Date()); //%tF permet de formater la date , alors que %tT permet de formater le temps
		
		//exemple concret nous allons lister les elements d'un dossier
		System.out.println("_________________________________________________________");
		
		File [] files = new File(".").listFiles(); /*grace a la class File ont va lister dans un tableau tous les elements du dossier racine
		 											du workspace*/
		for(File file : files) { 					//ici ont boucle tant qu'ont a des type File
			long sizeKo = file.length() / 1024; 	//ont creer une variable long pour lister la taille des objet dans le repertoire courant
			Date lastModifier = new Date(file.lastModified()); //idem pour la date
			String name = file.getName();			//idem pour le nom de chaques elements
			
			System.out.printf("| %,10d - %tF %tT |- %-20s |\n",sizeKo, lastModifier,lastModifier,name); //ont formate notre sortie
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}












