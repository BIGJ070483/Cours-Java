
public class TypesFlottants {

	public static void main(String[] args) {
		
		float f1 = 3.6f; /*ici ont ajouter un f apres le chiffre pour forcer le type float 
						   sinon le compileur comprend que c'est un double a cause de la virgule*/
		double d1 = 3.141592654;

		System.out.println(f1 + " - " + d1);
		
		//2 formes de représentation de flottants
		double first = 1.234;		//stynaxe classique
		double second = 1234e-3;	// notation exponentielle ( mantisse - exposant)
		System.out.println(first + " - " + second);
		
		
	}
}
