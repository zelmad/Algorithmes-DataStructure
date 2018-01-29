import java.io.*;
import java.util.*;


public class Binary {
	static int sum = 0;
	static int sum1 = 1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner enter = new Scanner(System.in);
		ArrayList<Integer> nombre = new ArrayList<>();
        int nbr = enter.nextInt();
        String list= Integer.toBinaryString(nbr);
		for(int y=list.length()-2;y>=0;y--){
			//System.out.println(list.charAt(y)+"     "+list.charAt(y+1));
			int a =Character.getNumericValue(list.charAt(y));
			int b =Character.getNumericValue(list.charAt(y+1));
			if(a==1){
				if(a==b){
					sum=1;
				}
				else{
					sum=0;
				}
				sum1+=sum;
				nombre.add(sum1);
			}
			else if(a==0){
				sum1 = 1;
			}
				
		}
		Collections.sort(nombre);
		System.out.println(nombre.get(nombre.size()-1));
		//Collections.sort(list1);
		//System.out.println(Integer.toBinaryString(439));
	    //System.out.print(list1.get(0));
	}
}