package Instructions;

public class TestFor {

	public static void main(String[] args) {
//traduction de l'instruction for:
//dans for() il faut obligatoirement 3 parametres
//ici:
//int i = 0
//ont initialise une variable a 0 (par convention cela est tres souvent int i = 0)
//i<10
//ici ont defini jusqu'a quand la boucle s'execute , ici ont defini que la boucle s'arrete
//lorsqu'elle atteint 10
//i++
//est l'incrementation de i, cela permet a chaque boucle de faire un +2 sur i jusqu'a 10 ou sur l'autre for de decrementer de 1 a chaque fois via i--
// ont termine obligatoirement une{ pour englober l'instruction suivante
		for(int i = 0; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Incrementation terminée\n");
		for(int i = 10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Décrementation terminée\n");
		
		for (int i = 0; i < 10; i++) {
			
		}
	}
}
