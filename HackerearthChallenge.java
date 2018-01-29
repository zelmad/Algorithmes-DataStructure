import java.util.*;

public class HackerearthChallenge{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int[] tab = new int[a];
		for(int i=0;i<a; i++){
			tab[i] = scn.nextInt();
		}
		int max = 0;
		for(int j=1; j<a; j++){
			boolean bol = true;
			while(bol){
				if(tab[j-1]>=tab[j]){
				    max +=1;
				    tab[j] = tab[j] + 1;
				    bol = true;
			    }
			    else{
				    bol = false;
				    continue;
			    }
			}
		}
		System.out.print(max);
	}
}