package Instructions;

public class TestIf {

	public static void main(String[] args) {

		int value = (int) (Math.random() * 10); // 0 < value < 9

		if (value > 7) {
			System.out.println(value + " - BIG");
			System.out.println("SUITE");
		}else if (value > 5) {
			System.out.println(value + " - MEDIUM");
		} else { /*
					 * que ce soit pour if ou else ou n'importe quel element si ont ne mets pas {
					 * cela va executé la 1ere instructions ( ici System.out.println(value +
					 * " - SMALL"); ) l'instruction suivante sera automatiquement executé quel que
					 * soit la ligne precedente il faut donc bien reflechir a l'indentation et
					 * surtout a la declaration de nos blocs
					 */
			System.out.println(value + " - SMALL");
			System.out.println("SUITE 2");
		}

	}

}
