
public class Binary {

	public static void main(String[] args) {
		
		for(int i=0; i<16; i++) {
			String str = Integer.toBinaryString(i);
			//while ( str.lenght() < 4 ) str = "0" + str;
			System.out.println(str);
		}
	}

}
