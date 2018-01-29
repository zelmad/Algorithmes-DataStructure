
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args){
		
		Scanner clv = new Scanner(System.in);
		
		int numberLines = clv.nextInt();
		
			int i = 0;
			
			while (i < numberLines) {
				
				String s1 = clv.next();
				String s2 = clv.next();
				
				StringBuilder sb1 = new StringBuilder(s1);
				StringBuilder sb2 = new StringBuilder(s2);

				First_String: for (int j = 0; j < sb1.length(); j++) {

					for (int k = 0; k < sb2.length(); k++) {

						if (sb1.charAt(j) == sb2.charAt(k)) {
							
							sb1.deleteCharAt(j);
							sb2.deleteCharAt(k);
							
							j--;
							continue First_String;
							
						}
					}
				}
				
				System.out.println(sb1.length() + sb2.length());
				i++;
		}

	}

}
