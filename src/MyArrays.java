import java.util.ArrayList;

public class MyArrays {

	public static void main(String[] args) {
		
		int [] firstArray = new int[5];					//ont creer un tableau et ont defini les cases de ce tableau
		firstArray[0] = 10;
		firstArray[1] = 20;
		firstArray[2] = 30;
		firstArray[3] = 40;
		firstArray[4] = 50;
		
		for(int value : firstArray) {					// ont boucle en creant la variable value, sur autant de case du tableau firstArray
			System.out.println(value);
		}

		int [] secondArray = {100,200,300,400,500};		//autre methode pour creer un tableau mais resultat similaire
		for(int value2 : secondArray) {					
			System.out.println(value2);
		}
		
		boolean [] thirdArray = {false,true,false}; 	//idem mais avec des types boolean 
		thirdArray[1]=true;								//je peut aussi initialiser une case de mon tableau ( ici la 2eme case en true)
		for (boolean b : thirdArray) {
			System.out.println(b);
		}
		System.out.println("__________");
		String [] values = new String [10];
		System.out.println(values.length);				//ici ont affiche la taille du tableau
		for (String string : values) {
			System.out.println(string);
			
		}

		System.out.println(args.length);				//ici la taille du tableau initial du main
		for (String string : args) {
			System.out.println(string);
			
		}
		System.out.println("______________");
		ArrayList<String> coll = new ArrayList<>(); 	//voici un exemple different de tableau, ont appel cela une collection
		coll.add("azerty");
		coll.add("qwerty");
		for (String string : coll) {
			System.out.println(string);
		}
	}

}
