package Instructions;

public class Mathematique {
	public static double mini(double a, double b) {
		if (a < b) {
			return a;
			
		}else {
			return b;
		}
	}
	
	public static double maxi(double a, double b) {
		return (a > b) ? a : b; 				// c est exactement la meme chose que
												// double result = (a>b ? a: b);
												// return result;
		
	}
	public static void main(String[] args) {
		
		System.out.println(mini(198523.157541, 57854854.45454));
		System.out.println(maxi (8.3, 5.7));	
	}

}
