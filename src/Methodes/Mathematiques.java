package Methodes;

public class Mathematiques {

	public static int maxi(int a , int b) { //methode static qui renvoi un int ( int = integer)
		return a>b ? a : b ;
		
	}
	
	public static int mini(int a , int b) { //methode static qui renvoi un int ( int = integer)
		return a<b ? a : b ;
		
	}
	
	public static int power(int value, int pow) {
		int accumulator = 1;
		for (int i = 0; i < pow; i++) {
			accumulator *= value;
			
		}
		return accumulator;
	}
	
	public static int pgcd (int first, int seconde) {
		
		
	}
	
	public static void main(String[] args) { //methode static qui ne renvoi rien ( void = rien)

			System.out.println("le nombre le plus petit entre 789 et 456 est " + mini (789, 456) );				//ici ont appel la methode mini pour effectuer la comparaison >
			System.out.println("le nombre le plus petit entre 123 et 456 est " + Mathematiques.mini (123, 456) ); // de meme facon que la ligne precedent mais en utilisant la formulation complete 
																						// de la methode mini qui est en francais la methode mini dans la class Mathematiques
																						//donc Mathematiques.mini sous la forme class.methode
			System.out.println("le nombre le plus grand entre 123 et 741 est " + maxi (123, 741) );
			
			System.out.println("power(2, 0) == " + power(2, 0)); // doit renvoyer 1
			System.out.println("power(2, 1) == " + power(2, 1)); // doit renvoyer 2
			System.out.println("power(2, 2) == " + power(2, 2)); // doit renvoyer 4
			System.out.println("power(2, 3) == " + power(2, 3)); // doit renvoyer 8
			

	}

}
