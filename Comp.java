import java.io.*;
import java.util.*;

public class Comp{
	public static void main(String[] agrs){
		Scanner clv= new Scanner(System.in);
		int a = clv.nextInt();
		int b = clv.nextInt();
		int[] taa = new int[a];
		int[] tab = new int[a];
		char[] character = new char[a];
		for(int i=0;i<a;i++){
			int z = clv.nextInt();
			int t = clv.nextInt();
			taa[i]=z;
			tab[i]=t;
		}
		for(int u=0; u<a;u++){
			for(int r=u+1;r<a;r++){
				if(tab[u] > tab[r]){
					int zel = tab[u];
					tab[u]=tab[r];
					tab[r]=zel;
					int mo = taa[u];
					taa[u] = taa[r];
					taa[r] = mo;
				}
				if(tab[u] == tab[r]){
					if(taa[u]>=taa[r]){
						taa[r]=0;
					}
					else if(taa[u]<=taa[r]){
						taa[u]=0;
					}
				}
			}
		}
		int sum = 0;
		for(int y=0; y<a;y++){
			System.out.println("  taa  "+ taa[y]+"  tab  "+tab[y]);
			if(tab[y]+1 <= b){
				sum +=taa[y];
			}
		}

		System.out.print(sum);
	}
}