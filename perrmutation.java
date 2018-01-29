import java.io.*;
import java.util.*;

public class perrmutation{
	public static void main(String[] args){
		Scanner enter = new Scanner(System.in);
		int in = enter.nextInt();
		perrmutation permission = new perrmutation();
		for(int i=0; i<in ;i++){
			String chaine = enter.next();
			permission.permuter(chaine, 0, chaine.length());
		}
		
	}
	public String change(String chain, int i, int j){
		char[] charact = chain.toCharArray();
		char temp = charact[i];
		charact[i] = charact[j];
		charact[j] = temp;
		return (String.valueOf(charact));
	}
	private void permuter(String str, int i, int j){
		if(i==j){
			System.out.println(str);
		}
		else{
			for(int y=i; y<j; y++){
				str = change(str, i, y);
				permuter(str,i+1,j);
				str = change(str, i, y);
			}
			
			
		}
	}
}