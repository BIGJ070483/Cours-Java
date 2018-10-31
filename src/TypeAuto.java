import java.util.Arrays;

public class TypeAuto {

	public static void main(String[] args) {
		
		var value = 10;					/*ici ont utilise var au lieu de int , cela permet UNIQUEMENT EN COMPILEUR JAVA10, de detecter
											automatiquement le type de variable creer, par contre cela ne permet pas de changer de type
											a la volée le type restera toujours le meme jusqu a conversion*/
		System.out.println(value);
		
        var date = new java.util.Date();
        System.out.println( date.getClass().getName() ); //recuperation du type de donnée que l'ont va afficher ici java.util.Date
        System.out.println( date );						// la ont affiche la valeur de la variable date

        
        var path = System.getProperty("java.class.path");
        System.out.println(path);
        
        var value1 = Arrays.asList(10,20,30);
        System.out.println(value1);
        
        for (var i : value1) {
        	System.out.println(i);
		}
                
	}

}
