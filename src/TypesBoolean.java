
public class TypesBoolean {

	public static void main(String[] args) {
		/*Le type booléen est un type qui définit deux états : l'état vrai et l'état faux. 
		  Les mots clés associés sont, naturellement, boolean, true (l'état vrai) et false (l'état faux).*/
		boolean state1 = true;
//		System.out.println(state1);
		
		boolean state2 = false;
//		System.out.println(state2);

		// operateurs booleens : && (and) ||(or) !(not)
		if ( state1 && state2 ) {
            System.out.println( "Les deux variables sont initialisées à true" );
        }

        if ( state1 || state2 ) {
            System.out.println( "L'une des deux variables est initialisée à true" );
        }
        
        if ( state1 == false ) {            // if ( state1 == false ) {
            System.out.println( "state1 est initialisée à false");
        }

        if ( ! state2 ) {           // if ( state2 == false ) {
            System.out.println( "state2 est initialisée à false");
        }
		
	}

}
