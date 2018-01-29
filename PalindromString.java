import java.util.*;
import java.io.*;
import java.lang.Character;

public class PalindromString{
	public static void main(String[] args){
		Scanner clv= new Scanner(System.in);
		String chaine = clv.next(); int sum=0;
		for(int i=0; i< chaine.length()/2; i++){
			if(chaine.charAt(i)==chaine.charAt(chaine.length()-i-1)){
				sum += 1;
			}
		}
		if(sum == chaine.length()/2){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}
}