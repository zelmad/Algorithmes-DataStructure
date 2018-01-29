//importation de libraries.

import java.util.Scanner;

public class RemovMinNbr{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		for(int i=0; i<a; i++){
			
			int e = scanner.nextInt();
			int n = scanner.nextInt();
			int[] lengthAr1 = new int[e];
			int[] lengthAr2 = new int[n];
			int sum = 0;
			for(int j=0; j< lengthAr1.length; j++){
				lengthAr1[j]=scanner.nextInt();
			}	
			for(int k=0; k< lengthAr2.length; k++){
				lengthAr2[k]=scanner.nextInt();
			}
			for(int o=0; o<lengthAr1.length; o++){
				for(int u=0; u<lengthAr2.length; u++){
					if(lengthAr1[o] == lengthAr2[u]){
						sum+=1;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
 