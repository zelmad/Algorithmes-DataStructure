import java.util.*;
import java.io.*;
import java.lang.Character;

public class ToggleString{
	public static void main(String[] args){
		Scanner clv = new Scanner(System.in);
		String chaine =  clv.next();
		String chain = "";
		for(int i=0; i<chaine.length(); i++){
			char a =' '; 
			char b=' ';
			if(Character.isLowerCase(chaine.charAt(i))){
				a = Character.toUpperCase(chaine.charAt(i));
				chain += Character.toString(a);
			}
			else{
				b = Character.toLowerCase(chaine.charAt(i));
				chain += Character.toString(b);
			}
		}
		System.out.print(chain);
	}
}