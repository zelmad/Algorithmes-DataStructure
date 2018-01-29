import java.io.*;
import java.util.*;

public class Competation{
	public static void main(String[] agrs){
		Scanner clv= new Scanner(System.in);
		int a = clv.nextInt();
		Integer[] tab=new Integer[a];
		for(int i=0;i<a;i++){
			tab[i]=clv.nextInt();			
		}
		Arrays.sort(tab, Collections.reverseOrder());
		int max = tab[0];
		for(int j=1;j<a;j++){
			if(tab[j]+j > max) max=tab[j]+j;
		}
		System.out.print(max+2);
	}
}