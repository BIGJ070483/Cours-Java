
public class TypesBoolean {

	public static void main(String[] args) {
		/*Le type bool�en est un type qui d�finit deux �tats : l'�tat vrai et l'�tat faux. 
		  Les mots cl�s associ�s sont, naturellement, boolean, true (l'�tat vrai) et false (l'�tat faux).*/
		boolean state1 = true;
//		System.out.println(state1);
		
		boolean state2 = false;
//		System.out.println(state2);

		// operateurs booleens : && (and) ||(or) !(not)
		if ( state1 && state2 ) {
            System.out.println( "Les deux variables sont initialis�es � true" );
        }

        if ( state1 || state2 ) {
            System.out.println( "L'une des deux variables est initialis�e � true" );
        }
        
        if ( state1 == false ) {            // if ( state1 == false ) {
            System.out.println( "state1 est initialis�e � false");
        }

        if ( ! state2 ) {           // if ( state2 == false ) {
            System.out.println( "state2 est initialis�e � false");
        }
		
	}

}
