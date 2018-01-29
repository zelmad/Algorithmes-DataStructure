import java.io.*;
import java.util.*;

public class MinArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner enter= new Scanner(System.in);
        int n= enter.nextInt();
		for(int i=0;i<n;i++){
			int b=enter.nextInt();
			if(b>0){
				double r=b/n;
				System.out.printf("%.3f \n", r);
				
			}
		}

    }
}