
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
	}

}
