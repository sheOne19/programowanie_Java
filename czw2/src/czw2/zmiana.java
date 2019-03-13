package czw2;

import java.io.IOException;
//import java.io.*;

public class zmiana {
	
	public static void main(String[]args) throws IOException{
		
		Cos("Kowalski");
		Cos("Shelukhov");
		Cos("Valiaiev");
		Cos("Sanya");
		

}
	public static String Cos(String name) {
		System.out.println(name);
		StringBuffer line = new StringBuffer(name);
		int i, j, n = 0;
		
		char consonant[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		char vowel[] = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		//for (i = 1; i<line.length(); i++) {
		//	for ( j = 1; j<consonant.length; j++) {
		//		if (line.charAt(i) == consonant[j]) {
		//			n = n++;
		//		}// else {
					//n = 0;
				//}
				
		//		}
		//	if (n>=1) {
		//		line.deleteCharAt(i++);
		//	}
	
	//}
		
		for (i = 1; i<line.length();i++) {
		
			if (line.charAt(i) == 'h') {
				line.deleteCharAt(i);
			}
			
			if (line.charAt(i) == 'i') {
				line.setCharAt(i, 'e');
			}
			
			if (line.charAt(i) == 'p') {
				line.setCharAt(i, 'b');
			}
			
			if (line.charAt(i) == 'k') {
				line.setCharAt(i, 'c');
			}
			
			if (line.charAt(i) == 't') {
				line.setCharAt(i, 'd');
			}
			
			if (line.charAt(i) == 'j') {
				line.setCharAt(i, 'g');
			}
			
			if (line.charAt(i) == 'm') {
				line.setCharAt(i, 'n');
			}
			
			if (line.charAt(i) == 'w') {
				line.setCharAt(i, 'v');
			}
			
		}
		System.out.println(line);
		
		return name;
	}
}