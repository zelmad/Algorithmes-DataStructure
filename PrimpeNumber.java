import java.util.Scanner;
import java.util.*;

public class PrimpeNumber {

	public static void main(String[] args){
		
		Scanner clv = new Scanner(System.in);
		
		ArrayList<Integer> listOfNumb = new ArrayList<>();
		
		int numberLines = clv.nextInt();
		listOfNumb.add(2);
		for(int i=3; i<numberLines; i++){
			int sum =0;
			for(int j=2; j<i; j++){
				if(i%j ==0){
					sum+=1;
				}
			}
			if(sum == 0){
				listOfNumb.add(i);
			}
	    }
		for(int j=0; j<listOfNumb.size(); j++ ){
			System.out.print(listOfNumb.get(j)+" ");
		}
	}
}