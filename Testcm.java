import java.util.*;
import java.lang.Math;

public class Testcm{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a = Integer.parseInt(scn.nextLine());
		for(int i=0; i<a; i++){
			int b = Integer.parseInt(scn.nextLine());
			int div = b/6;
			int div2 = (b+1)%6;
			if(div2 != 0){
				System.out.println("YES");
			}
			else{
				System.out.print("NO");
			}
		}
	}
}