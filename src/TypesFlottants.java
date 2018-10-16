
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
		
		//attention piege
		double result = 1/3; /*ici ont divise 1 (entier) par 3 (entier) forcement 1 diviser par 3 = 0
								il faut plutot mettre 1.0/3.0 ou au moins un des chiffre avec une virgule*/
		System.out.println(result);
		
		//valeurs possibles
		double essai1 = 3.1415; //definition standard d'un double
		double essai2 = 3/0.0;  // aura pour resultat Infinity car ont peut diviser 3 par 0 une infinité de fois
		double essai3 = 0.0/0.0;// aura pour resultat NaN = not a number 
		System.out.println(essai1 +"-"+essai2+"-"+essai3);
		
		float f2 = 3.6f;
		float f3 = Float.NaN;
		float f4 = Float.NEGATIVE_INFINITY;
		System.out.println(f2 +"-"+f3+"-"+f4+"\n");
		
		System.out.println(Float.isFinite(f2)+" f2");
		System.out.println(Float.isFinite(f3)+" f3");
		System.out.println(Float.isFinite(f4)+" f4\n");
		
		System.out.println(Float.isInfinite(f2)+" f2");
		System.out.println(Float.isInfinite(f3)+" f3");
		System.out.println(Float.isInfinite(f4)+" f4\n");
		
		System.out.println(Float.isNaN(f2)+" f2");
		System.out.println(Float.isNaN(f3)+" f3");
		System.out.println(Float.isNaN(f4)+" f4\n");
	}
}
