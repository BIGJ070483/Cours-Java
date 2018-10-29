
public class StringOptims {

	private static final int LOOP_COUNT = 10_000_000;
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		System.out.println(begin);
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		//for (int i=0 ; i<LOOP_COUNT; i++){
			String fullMessage = "Begin - ";
			fullMessage += part1;
			fullMessage += " - ";
			fullMessage += part2;
			fullMessage += " - ";
			fullMessage += part3;
			fullMessage += " - ";
			fullMessage += part4;
			fullMessage += " - End";
			System.out.println( fullMessage);	
			//}
			
			long end = System.currentTimeMillis();
			System.out.println( "Duration: " + (end-begin)+ "ms");
		

	}

}