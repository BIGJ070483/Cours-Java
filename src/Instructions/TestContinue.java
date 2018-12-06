package Instructions;

public class TestContinue {

	public static void main(String[] args) {
//dans cette exemple nous faisons une boucle simple sur i<10
//sauf que dans cette boucle for ont y inclus un if i==5 continue
//cela veut dire que si i est egal a 5 cela fait continuer la boucle sans executé son contenu
//cela bypass la commande system.out.println et reprend la boucle sur i=6
		for (int i = 0; i < 10; i++) {
			if(i == 5 ) {
				continue;
			}
			System.out.println(i);
	
		}
		System.out.println("__________");
		int i=0;
		while(i<10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("end");

	}

}
