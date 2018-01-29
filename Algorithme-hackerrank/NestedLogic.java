import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int sum = 0;
		Scanner clv= new Scanner(System.in);
		String[] chaine = clv.nextLine().split(" ");
		String[] chain = clv.nextLine().split(" ");
		int[] tab = new int[3], to = new int[3];
		long t1 = System.currentTimeMillis();
		System.out.println(t1);
		for(int i=0;i<3;i++){
			tab[i] = Integer.parseInt(chaine[i]);
			to[i] = Integer.parseInt(chain[i]);
		}
		if(tab[2]<to[2]){
			sum = 0;
		}
		else if(tab[2] > to[2]){
			sum += 10000;
		}
		else if(tab[1]>to[1]){
			sum+=500 * (tab[1] - to[1]);
		}
		else if(tab[0] > to[0]){
			sum = 15 * (tab[0] - to[0]); 
		}
		else{
			sum = 0;
		}
		System.out.println(sum);
		long t2 = System.currentTimeMillis();
		System.out.println(t2);
    }
}