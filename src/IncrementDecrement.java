
public class IncrementDecrement {

	public static void main(String[] args) {
		
		//ici ont explique l'importance de l'ordre des operations
		
		int a = 10 ;
		System.out.println(++a); //ici ont incremente +1 à la variable "a" avant son utilisation
		
		int aa = 20; 
		System.out.println(aa++); /* ici ont incremente +1 a la variable " aa" apres son utilisation , 
									le systeme affiche d'abord le resultat de la variable puis l'incremente*/
		System.out.println(aa); /* pour afficher le resultat de l'increment ont reaffiche la variable apres l'increment fait 
									APRES l'affichage de la variable*/
		
		int part1 = 10 ;
		int part2 = 20 ;
		int result = part1++ + part2++ ; // ici l'increment est apres la variable donc java calcul d'abord part1+part2 puis fait l'increment
		System.out.println(result+"-"+part1+"-"+part2); // donc ici nous avons le resultat de part1+part2= 30 puis part1++= 11 puis part2++=21
		
		int part3 = 10 ;
		int part4 = 20 ;
		int result1 = ++part3 + ++part4 ;// ici l'insrement est avant la variable donc java fait d'abord l'increment puis le calcul
		System.out.println(result1+"-"+part3+"-"+part4);
		
		//voici la bonne marche a suivre histoire de pas s'emmeler les pinceaux
		int a1 = 0 ;//declaration de la variable et initialisation a 0
		a1++; //incrementation de la variable
		int a2 = 0 ; //declaration de la variable et initialisation a 0
		a2++;//incrementation de la variable
		int result2 = a1 + a2 ; // resultat de l'operation des 2 variables deja incrementées
		System.out.println(result2); // affichage du resultat
		
	}

}
