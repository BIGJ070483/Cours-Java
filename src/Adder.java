import java.util.ArrayList;

public class Adder {

	public static void main(String[] args) {
/*Le programme suivant vous montre comment utiliser quelques-unes de ces méthodes. 
 * On cherche à y ajouter tous les entiers passés en paramètres du main (donc à partir de la ligne commande). 
 * Or, args est typé String [] : nos méthodes interviennent à ce niveau-là, 
 * car on cherche à transformer les chaînes en valeurs entières et à les ajouter entre elles. 
 * Au final on transforme le résultat entier en une chaîne de caractères (ce ne serait pas obligatoire, mais c'est pour l'exemple).*/
        int accumulator = 0;
        
        for( String param : args ) {
            accumulator += Integer.parseInt( param );
        }
        
        String strAccumulator = Integer.valueOf( accumulator ).toString();
        System.out.println( strAccumulator );

        System.out.println( Byte.MIN_VALUE );
        System.out.println( Byte.MAX_VALUE );

        System.out.println( Short.MIN_VALUE );
        System.out.println( Short.MAX_VALUE );

        System.out.println( Integer.MIN_VALUE );
        System.out.println( Integer.MAX_VALUE );

        System.out.println( Long.MIN_VALUE );
        System.out.println( Long.MAX_VALUE );

        char theChar1 = 'e';
        char theChar2 = '5';

        System.out.println( Character.isDigit( theChar1 ) );      // false
        System.out.println( Character.isDigit( theChar2 ) );      // true

        System.out.println( Character.isLetter( theChar1 ) );     // true
        System.out.println( Character.isLetter( theChar2 ) );     // false

        System.out.println( Character.isLowerCase( theChar1 ) );  // true
        System.out.println( Character.isLowerCase( theChar2 ) );  // false

        System.out.println( Character.isUpperCase( theChar1 ) );  // false
        System.out.println( Character.isUpperCase( theChar2 ) );  // false

        System.out.println( Character.isSpaceChar( theChar1 ) );  // false
        System.out.println( Character.isSpaceChar( theChar2 ) );  // false
        System.out.println( Character.isSpaceChar( ' ' ) );       // true

        // Integer value = new Integer( 123 );      // Possible, mais déprécié au profit de ...
        Integer value = Integer.valueOf( 123 );
        System.out.println( value );                // affiche 123

        Integer value1 = 123;                // Auto-boxing
        System.out.println( value1 );        // Affiche 123
        
        // Il est même possible d'écrire
        value1 += 2;
        System.out.println( value1 );        // Affiche 125;
        

        ArrayList<Integer> collection = new ArrayList<>();
        collection.add( 10 );
        collection.add( 20 );
        collection.add( 30 );
        for ( int value2 : collection ) {
            System.out.println( value2 );
        }
	}

}
