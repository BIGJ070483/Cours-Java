
public class StatementBlock {

	public static void main(String[] args) {
		/*une variable n'est active que dans un meme bloc, voir ci dessous*/
		
		int a = 10;
		System.out.println(a);

		{
			//int a = 30; //ont ne peut pas nommer une variable de la meme facon qu'une autre precedement créée, 
						  //meme si ont est dans un sous bloc
			int b = 20;
			a++;
			System.out.println(a +"-"+ b); //ici ont peut utiliser la variable a car nous sommes dans un sous bloc dans lequel a a ete declaré
		}
		//System.out.println(b); // par contre ont ne peut pas utiliser b car elle a ete declaré dans 
							     // un bloc qui est maintenant fermer par } à la ligne 14
		
		}

}
