import java.util.*;

public class Cipher{

	static char rotation(char[] str, int lengt, int a, int b){
		char art = ' ';

		if(b / lengt !=0 ){
			int uu = b % lengt;
			if(uu + a >  lengt){
				art = str[a+uu - lengt];
			}
			else{
				art = str[a+uu];
			}
		}
		else{
			if(a+b > lengt){
				art = str[a+b-lengt];
			}
			else{
				art = str[a+b];
			}
		}
		return art;
	}
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int a = scanner.nextInt();

		final String uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String lowers = "abcdefghijklmnopqrstuvwxyz";

		char[] uppersCase = uppers.toCharArray();
		char[] lowersCase = lowers.toCharArray();

		//final String numbers = "0123456789";

		String result = "";

		for(int i=0; i<str.length(); i++){

			//System.out.println("the length of this string "+str.length());

			if(Character.isUpperCase(str.charAt(i))){

				for(int j =0; j<= 25; j++){

					if(uppersCase[j] == str.charAt(i)){

						result += rotation(uppersCase, str.length(), j, a);

					}
				}

				//System.out.println(i + a);

			}
			else if(Character.isLowerCase(str.charAt(i))){

				for(int j =0; j<= 25; j++){

					if(lowersCase[j] == str.charAt(i)){

						result += rotation(lowersCase, str.length(), j, a);

					}
				}
				//System.out.println(i + a);

			}
			else if(Character.isDigit(str.charAt(i))){

				int sum = a + Character.getNumericValue(str.charAt(i));
				if(sum > 10){
					result += sum - 10;
				}
				else{
					result += sum;
				}
			}
			else{
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
}