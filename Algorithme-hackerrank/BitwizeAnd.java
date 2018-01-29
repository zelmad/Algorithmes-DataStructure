import java.io.*;
import java.util.*;

public class BitwizeAnd {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner clv = new Scanner(System.in);
		int a = clv.nextInt();
		for(int i=0; i<a; i++){
            int maximum = 0;
			int b = clv.nextInt();
			int c = clv.nextInt();
			for(int j=1; j<b; j++){
				for(int h=j+1;h<=b;h++){
					int rf = j & h;
                    if(rf < c && maximum < rf) maximum = rf;
				}
			}
            System.out.println(maximum);
		}			
	}
}