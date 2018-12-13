package Methodes;

public class Mathematiques {

	public static int maxi(int a , int b) { //methode static qui renvoi un int ( int = integer)
		return a>b ? a : b ;
		
	}
	
	public static int mini(int a , int b) { //methode static qui renvoi un int ( int = integer)
		return a<b ? a : b ;
		
	}
	
	public static int power(int value, int pow) {
		
	}
	
	
	public static void main(String[] args) { //methode static qui ne renvoi rien ( void = rien)

			System.out.println("le nombre le plus petit entre 789 et 456 est " + mini (789, 456) );				//ici ont appel la fontion mini pour effectuer la comparaison >
			System.out.println("le nombre le plus petit entre 123 et 456 est " + Mathematiques.mini (123, 456) ); // de meme facon que la ligne precedent mais en utilisant la formulation complete 
																						// de la fonction mini qui est en francais la fonction mini dans la class Mathematiques
																						//donc Mathematiques.mini sous la forme class.fonction
			System.out.println("le nombre le plus grand entre 123 et 741 est " + maxi (123, 741) );
			
			

	}

}
