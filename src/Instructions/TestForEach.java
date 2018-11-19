package Instructions;

import java.util.ArrayList;

public class TestForEach {

	public static void main(String[] args) {
		int [] array = {10,20,30,40,50,60,70,80,900,100};
		
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			System.out.println(value);
						
		}
		
		System.out.println("___________________________");
		for (int value : array) {
			System.out.println(value);
		}
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("Python");
		languages.add("C#");
		languages.add("Perl");
		languages.add(".Net");
		
		for (String language : languages) {
			System.out.println(language);
		}
	}

}
