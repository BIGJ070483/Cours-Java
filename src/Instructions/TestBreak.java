package Instructions;

public class TestBreak {

	public static void main(String[] args) {
//contrairement a la fonction continue, break arrete la boucle , en sors, et continue l'execution du code
		for (int i = 0; i < 10; i++) {
			if(i == 5 ) {
				break;
			}
			System.out.println(i);
	
		}
		System.out.println("end");
		System.out.println("________");

		
test: //ceci est une etiquette
		for (int line = 0; line < 10; line++) {
			for (int column = 0; column < 10; column++) {
				if(line ==5 && column ==5) {
					break test; //ici ont defini le break au niveau de l'etiquette et donc nous fait sortir completement de toutes les boucles et continu l'execution
				}
				System.out.println(line + "-" + column);
				
			}
		}
		
		
		
		System.out.println("end");
	}

}
