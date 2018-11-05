
public class TestIf {

	public static void main(String[] args) {
		
		int value = (int) (Math.random()*10); //0 < value < 9

		if (value > 5) {
			System.out.println(value + " - BIG");
			System.out.println("SUITE");
		} else 			System.out.println(value + " - SMALL");
		System.out.println("SUITE 2");
		
	}

}
