import java.util.*;
public class OddSegment{

	public static void main(String[] args)throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int[] tab = new int[a];
		for(int i=0; i<a; i++){
			tab[i]= scanner.nextInt();
		}
		if(a==1){
			if(tab[0]%2 != 0){
				System.out.print("Yes");
			}
			else{
				System.out.print("No");
			}
		}
		else if(a % 2 == 0){
			System.out.print("No");
		}
		else{
			if(tab[0]%2 !=0 && tab[tab.length-1]%2 !=0){
				System.out.print("Yes");
			}
			else{
				System.out.print("No");
			}
		}
	}
}