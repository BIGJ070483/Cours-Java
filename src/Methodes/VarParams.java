package Methodes;

public class VarParams {

//	public static int add (int [] values) {
//		int accumulateur = 0;
//		for (int val : values) {
//			accumulateur += val;
//		}
//		return accumulateur;
//	}
	
	
	public static int add (int ... values) {
		int accumulateur = 0;
		for (int val : values) {
			accumulateur += val;
		}
		return accumulateur;
	}
	public static void main(String[] args) {
	
		int [] values = { 10, 20,30,40,50};
		System.out.println(add(values));
//		ci dessous ont voit qu'il est impossible d'afficher l'appel d'une fonction necessitant un tableau sans l'appel d'un tableau lui meme
//		System.out.println(add());
//		System.out.println(add(10));
//		System.out.println(add(10,20));
//		System.out.println(add(10,20,30));
//		System.out.println(add(10,20,30,40));
//		System.out.println(add(10,20,30,40,50));
		
		
		System.out.printf("[%d/%d]\n", 3, 7);
		System.out.printf("[%d/%d/%d]\n", 3, 7, 9);
	}

}
