
public class Precedence {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int result = a + b * c;
		System.out.println(result);
		
		boolean check = a < 10  ||  a > 90 ;
		if (check) {
			System.out.println("WARNING: Exceeding the limits");
			
		}

	}
//	Liste des opérateurs des plus prioritaires (en haut) au moins prioritaires (en bas)
//	postfix						expr++ expr--
//	unary						++expr --expr +expr -expr ~ !
//	multiplicative				* / %
//	additive					+ -
//	shift						<< >> >>>
//	relational					< > <= >= instanceof
//	equality					== !=
//	bitwise 					AND	&
//	bitwise exclusive OR		^
//	bitwise inclusive OR		|
//	logical AND					&&
//	logical OR					||
//	ternary						? :
//	assignment					= += -= *= /= %= &= ^= |= <<= >>= >>>=
}
